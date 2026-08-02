package ru.ok.android.util;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import xsna.lbr;
import xsna.z9r;

/* loaded from: classes9.dex */
public final class Files {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BUFFER_SIZE = 4096;
    public static final byte[] SEPARATOR = {44};
    private static final AtomicReference<byte[]> BUF = new AtomicReference<>();

    private Files() {
    }

    public static void cat(File file, File file2, boolean z) throws IOException {
        if (file == null || file.getParentFile() == null || file2 == null || length(file2) == 0) {
            return;
        }
        if (!file.exists()) {
            mkdirs(file.getParentFile());
            try {
                if (file2.renameTo(file)) {
                    return;
                }
            } catch (SecurityException e) {
                throw new IOException("Can't grab file due to security restrictions", e);
            }
        }
        InputStream fileInputStream = new FileInputStream(file2);
        if (z) {
            fileInputStream = new GZIPInputStream(fileInputStream);
        }
        try {
            long length = length(file);
            OutputStream fileOutputStream = new FileOutputStream(file, true);
            byte[] obtainBuf = obtainBuf();
            if (z) {
                try {
                    fileOutputStream = new GZIPOutputStream(fileOutputStream, 4096, true);
                } finally {
                    releaseBuf(obtainBuf);
                }
            }
            if (length > 0) {
                try {
                    fileOutputStream.write(SEPARATOR);
                } finally {
                }
            }
            while (true) {
                int read = fileInputStream.read(obtainBuf);
                if (read < 0) {
                    fileOutputStream.close();
                    fileInputStream.close();
                    delete(file2);
                    return;
                }
                fileOutputStream.write(obtainBuf, 0, read);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void delete(File file) throws IOException {
        if (file != null && !deleteFile(file) && !deleteFile(file)) {
            throw new IOException(z9r.a(file, "Cannot delete file "));
        }
    }

    private static boolean deleteDirectory(@NonNull File file) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (!deleteFile(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    private static boolean deleteFile(@NonNull File file) {
        try {
            if (file.isDirectory()) {
                return deleteDirectory(file);
            }
            if (file.exists()) {
                return file.delete();
            }
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean isCompressed(File file) throws IOException {
        if (file != null && length(file) != 0) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    new GZIPInputStream(fileInputStream, 4096).close();
                    fileInputStream.close();
                    return true;
                } finally {
                }
            } catch (ZipException unused) {
            }
        }
        return false;
    }

    public static long length(File file) {
        if (file == null) {
            return 0L;
        }
        try {
            return file.length();
        } catch (SecurityException unused) {
            return 0L;
        }
    }

    public static void mkdirs(File file) throws IOException {
        if (!file.exists()) {
            if (file.mkdirs()) {
                return;
            }
            throw new IOException("Cannot create directory " + file.getAbsolutePath());
        }
        if (file.isDirectory()) {
            return;
        }
        throw new IOException(file.getAbsolutePath() + " is expected to be a directory");
    }

    public static void mkfile(File file) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            throw new IOException("missing parent file for " + file.getPath());
        }
        mkdirs(parentFile);
        if (!file.exists() || file.isFile()) {
            return;
        }
        throw new IOException(file.getAbsolutePath() + " is expected to be a file");
    }

    private static byte[] obtainBuf() {
        byte[] andSet = BUF.getAndSet(null);
        return andSet != null ? andSet : new byte[4096];
    }

    public static String readTextFile(File file, boolean z) throws IOException {
        StringBuilder sb = new StringBuilder();
        char[] cArr = new char[1024];
        InputStreamReader inputStreamReader = new InputStreamReader(z ? new GZIPInputStream(new FileInputStream(file)) : new FileInputStream(file));
        while (true) {
            try {
                int read = inputStreamReader.read(cArr);
                if (read < 0) {
                    inputStreamReader.close();
                    return sb.toString();
                }
                sb.append(cArr, 0, read);
            } catch (Throwable th) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private static void releaseBuf(byte[] bArr) {
        BUF.set(bArr);
    }

    public static void streamCopy(File file, OutputStream... outputStreamArr) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            streamCopy(fileInputStream, outputStreamArr);
            fileInputStream.close();
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static List<String> unzip(File file, File file2, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (z) {
            deleteFile(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        ZipFile zipFile = new ZipFile(file2);
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                if (!nextElement.isDirectory()) {
                    File file3 = new File(file, nextElement.getName());
                    File parentFile = file3.getParentFile();
                    if (parentFile != null && (parentFile.exists() || parentFile.mkdirs())) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                        InputStream inputStream = zipFile.getInputStream(nextElement);
                        try {
                            streamCopy(inputStream, fileOutputStream);
                            IOUtil.INSTANCE.close(inputStream, fileOutputStream);
                            arrayList.add(nextElement.getName());
                        } catch (Throwable th) {
                            IOUtil.INSTANCE.close(inputStream, fileOutputStream);
                            throw th;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to ensure directory: ");
                    sb.append(parentFile != null ? parentFile.getAbsolutePath() : null);
                    throw new FileNotFoundException(sb.toString());
                }
            }
            IOUtil.INSTANCE.close(zipFile);
            return arrayList;
        } catch (Throwable th2) {
            IOUtil.INSTANCE.close(zipFile);
            throw th2;
        }
    }

    public static void zipFiles(File file, File file2) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
            try {
                File[] listFiles = file.listFiles(new lbr());
                if (listFiles == null) {
                    zipOutputStream.close();
                    fileOutputStream.close();
                    return;
                }
                for (File file3 : listFiles) {
                    try {
                        zipOutputStream.putNextEntry(new ZipEntry(file3.getName()));
                        streamCopy(file3, zipOutputStream);
                        zipOutputStream.closeEntry();
                    } finally {
                    }
                }
                zipOutputStream.close();
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long length(File... fileArr) {
        long j = 0;
        if (fileArr == null) {
            return 0L;
        }
        for (File file : fileArr) {
            j += length(file);
        }
        return j;
    }

    public static long length(Collection<File> collection) {
        long j = 0;
        if (collection == null) {
            return 0L;
        }
        Iterator<File> it = collection.iterator();
        while (it.hasNext()) {
            j += length(it.next());
        }
        return j;
    }

    public static void streamCopy(InputStream inputStream, OutputStream... outputStreamArr) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return;
                }
                for (OutputStream outputStream : outputStreamArr) {
                    if (outputStream != null) {
                        outputStream.write(bArr, 0, read);
                    }
                }
            } finally {
                IOUtil.INSTANCE.flush(outputStreamArr);
            }
        }
    }
}

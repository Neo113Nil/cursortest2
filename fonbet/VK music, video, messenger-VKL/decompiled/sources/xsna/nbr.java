package xsna;

import io.jsonwebtoken.JwtParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.FileWalkDirection;
import kotlin.io.NoSuchFileException;

/* loaded from: classes11.dex */
public final class nbr extends obr {
    public static void j(File file, String str) {
        Charset charset = emb.b;
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            y(fileOutputStream, str, charset);
            s3q0 s3q0Var = s3q0.a;
            fileOutputStream.close();
        } finally {
        }
    }

    public static void k(File file, File file2, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.");
        }
        if (file2.exists()) {
            if (!z) {
                throw new FileAlreadyExistsException(file, file2, "The destination file already exists.");
            }
            if (!file2.delete()) {
                throw new FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new FileSystemException(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                i7o0.b(fileInputStream, fileOutputStream, 8192);
                s3q0 s3q0Var = s3q0.a;
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static boolean l(File file) {
        Iterator<File> it = new war(file, FileWalkDirection.BOTTOM_UP).iterator();
        while (true) {
            boolean z = true;
            while (it.hasNext()) {
                File next = it.next();
                if (next.delete() || !next.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static String m(File file) {
        return drm0.i0(JwtParser.SEPARATOR_CHAR, file.getName(), "");
    }

    public static String n(File file) {
        return drm0.n0(file.getName(), ".");
    }

    public static final q9r o(q9r q9rVar) {
        File a = q9rVar.a();
        List<File> b = q9rVar.b();
        ArrayList arrayList = new ArrayList(b.size());
        for (File file : b) {
            String name = file.getName();
            if (epx.f(name, ".")) {
                s3q0 s3q0Var = s3q0.a;
            } else if (!epx.f(name, "..")) {
                arrayList.add(file);
            } else if (arrayList.isEmpty() || epx.f(((File) j5g.i0(arrayList)).getName(), "..")) {
                arrayList.add(file);
            }
        }
        return new q9r(a, arrayList);
    }

    public static byte[] p(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArr = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int read = fileInputStream.read(bArr, i3, i2);
                if (read < 0) {
                    break;
                }
                i2 -= read;
                i3 += read;
            }
            if (i2 > 0) {
                bArr = Arrays.copyOf(bArr, i3);
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    raq raqVar = new raq();
                    raqVar.write(read2);
                    i7o0.b(fileInputStream, raqVar, 8192);
                    int size = raqVar.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] m = raqVar.m();
                    bArr = Arrays.copyOf(bArr, size);
                    System.arraycopy(m, 0, bArr, i, raqVar.size());
                }
            }
            fileInputStream.close();
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ro.e(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static ArrayList q(File file) {
        Charset charset = emb.b;
        ArrayList arrayList = new ArrayList();
        a0a.a(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), new m8r(arrayList, 1));
        return arrayList;
    }

    public static String r(File file, Charset charset) {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String b = a0a.b(inputStreamReader);
            inputStreamReader.close();
            return b;
        } finally {
        }
    }

    public static final File s(File file, File file2) {
        if (obr.h(file2.getPath()) > 0) {
            return file2;
        }
        String file3 = file.toString();
        if (file3.length() != 0) {
            char c = File.separatorChar;
            if (!drm0.G(file3, c)) {
                return new File(file3 + c + file2);
            }
        }
        return new File(file3 + file2);
    }

    public static File t(File file, String str) {
        return s(file, new File(str));
    }

    public static war u(File file) {
        return new war(file, FileWalkDirection.TOP_DOWN);
    }

    public static void v(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            s3q0 s3q0Var = s3q0.a;
            fileOutputStream.close();
        } finally {
        }
    }

    public static void w(File file, String str, Charset charset) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            y(fileOutputStream, str, charset);
            s3q0 s3q0Var = s3q0.a;
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void y(FileOutputStream fileOutputStream, String str, Charset charset) {
        if (str.length() < 16384) {
            fileOutputStream.write(str.getBytes(charset));
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int min = Math.min(8192 - i2, str.length() - i);
            int i3 = i + min;
            str.getChars(i, i3, allocate.array(), i2);
            allocate.limit(min + i2);
            i2 = 1;
            if (!onUnmappableCharacter.encode(allocate, allocate2, i3 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(allocate2.array(), 0, allocate2.position());
            if (allocate.position() != allocate.limit()) {
                allocate.put(0, allocate.get());
            } else {
                i2 = 0;
            }
            allocate.clear();
            allocate2.clear();
            i = i3;
        }
    }
}

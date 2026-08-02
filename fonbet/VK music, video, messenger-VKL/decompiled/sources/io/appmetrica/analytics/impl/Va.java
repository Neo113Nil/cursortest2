package io.appmetrica.analytics.impl;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes8.dex */
public abstract class Va {
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(File file) {
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        FileLock fileLock;
        if (file != null && file.exists()) {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    fileLock = channel.lock(0L, Long.MAX_VALUE, true);
                    try {
                        ByteBuffer allocate = ByteBuffer.allocate((int) file.length());
                        channel.read(allocate);
                        allocate.flip();
                        byte[] array = allocate.array();
                        file.getAbsolutePath();
                        a(fileLock);
                        vo.a((Closeable) randomAccessFile);
                        bArr = array;
                    } catch (IOException | SecurityException unused) {
                        bArr = null;
                        if (bArr != null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            C4710ak c4710ak = AbstractC5326yj.a;
                            c4710ak.getClass();
                            c4710ak.a(new C5351zj("error_during_file_reading", th));
                            bArr = null;
                            if (bArr != null) {
                            }
                        } finally {
                            file.getAbsolutePath();
                            a(fileLock);
                            vo.a((Closeable) randomAccessFile);
                        }
                    }
                } catch (IOException | SecurityException unused2) {
                    fileLock = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileLock = null;
                }
            } catch (IOException | SecurityException unused3) {
                randomAccessFile = null;
                fileLock = null;
            } catch (Throwable th3) {
                th = th3;
                randomAccessFile = null;
                fileLock = null;
            }
            if (bArr != null) {
                return null;
            }
            try {
                return new String(bArr, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
            } catch (UnsupportedEncodingException e) {
                String str = new String(bArr);
                C4710ak c4710ak2 = AbstractC5326yj.a;
                c4710ak2.getClass();
                c4710ak2.a(new C5351zj("read_share_file_with_unsupported_encoding", e));
                return str;
            }
        }
        bArr = null;
        if (bArr != null) {
        }
    }

    public static void a(FileLock fileLock) {
        if (fileLock == null || !fileLock.isValid()) {
            return;
        }
        try {
            fileLock.release();
        } catch (IOException unused) {
        }
    }

    public static void a(String str, FileOutputStream fileOutputStream) {
        FileLock fileLock = null;
        try {
            FileChannel channel = fileOutputStream.getChannel();
            fileLock = channel.lock();
            byte[] bytes = str.getBytes(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
            ByteBuffer allocate = ByteBuffer.allocate(bytes.length);
            allocate.put(bytes);
            allocate.flip();
            channel.write(allocate);
            channel.force(true);
        } catch (IOException unused) {
        } finally {
            a(fileLock);
            vo.a((Closeable) fileOutputStream);
        }
    }
}

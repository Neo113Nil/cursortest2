package ru.ok.android.utils.log;

import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes9.dex */
public class SDCardFileAppender implements LineAppender {
    private static final long FLUSH_INTERVAL_MS = 8000;
    private static final String LOG_TAG = "SDCardFileAppender";
    private static final int MAX_LINES_IN_BUFFER = 100000;
    private static volatile int instanceCount;
    private final File file;
    private int instanceNum;
    private final ConcurrentLinkedQueue<String> linesBuffer;

    public SDCardFileAppender(String str) {
        int i = instanceCount + 1;
        instanceCount = i;
        this.instanceNum = i;
        this.linesBuffer = new ConcurrentLinkedQueue<>();
        this.file = new File(Environment.getExternalStorageDirectory(), str);
        Thread thread = new Thread("SDCardFileAppender-" + this.instanceNum) { // from class: ru.ok.android.utils.log.SDCardFileAppender.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        SDCardFileAppender.this.flush();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    try {
                        Thread.sleep(SDCardFileAppender.FLUSH_INTERVAL_MS);
                    } catch (InterruptedException e) {
                        SDCardFileAppender.this.flush();
                        Log.e(SDCardFileAppender.LOG_TAG, "Interrupted: " + e, e);
                    }
                }
            }
        };
        thread.setPriority(1);
        thread.start();
    }

    @Override // ru.ok.android.utils.log.LineAppender
    public void append(String str) {
        if (this.linesBuffer.size() < 100000) {
            this.linesBuffer.add(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0071 -> B:27:0x009f). Please report as a decompilation issue!!! */
    @Override // ru.ok.android.utils.log.LineAppender
    public synchronized void flush() {
        PrintWriter printWriter;
        IOException e;
        if (this.linesBuffer.isEmpty()) {
            return;
        }
        File parentFile = this.file.getParentFile();
        boolean exists = parentFile.exists();
        PrintWriter printWriter2 = exists;
        if (!exists) {
            boolean mkdirs = parentFile.mkdirs();
            printWriter2 = mkdirs;
            if (!mkdirs) {
                Log.e(LOG_TAG, "Failed to create directory: " + parentFile.getPath());
                return;
            }
        }
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                printWriter = new PrintWriter(new FileOutputStream(this.file, true));
                while (!this.linesBuffer.isEmpty()) {
                    try {
                        printWriter.println(this.linesBuffer.peek());
                        this.linesBuffer.poll();
                    } catch (IOException e2) {
                        e = e2;
                        Log.e(LOG_TAG, "Failed to flush to file: " + e, e);
                        if (printWriter != null) {
                            try {
                                printWriter.flush();
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                            printWriter.close();
                        }
                    }
                }
                try {
                    printWriter.flush();
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
                printWriter.close();
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
        } catch (IOException e3) {
            printWriter = null;
            e = e3;
        } catch (Throwable th5) {
            printWriter2 = 0;
            th = th5;
            if (printWriter2 != 0) {
                try {
                    printWriter2.flush();
                } catch (Throwable th6) {
                    th6.printStackTrace();
                }
                try {
                    printWriter2.close();
                } catch (Throwable th7) {
                    th7.printStackTrace();
                }
            }
            throw th;
        }
    }
}

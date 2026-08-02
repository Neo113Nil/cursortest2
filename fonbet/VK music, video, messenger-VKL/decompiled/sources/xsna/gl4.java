package xsna;

import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* compiled from: AudioBuffer.kt */
/* loaded from: classes3.dex */
public final class gl4 {
    public final int a;
    public ByteBuffer b;
    public ByteBuffer c;
    public int d;
    public int e;

    public gl4(int i) {
        this.a = i;
        ByteBuffer allocate = ByteBuffer.allocate(i);
        int capacity = allocate.capacity();
        allocate.limit(capacity);
        allocate.position(capacity);
        ByteBuffer allocate2 = ByteBuffer.allocate(i);
        int capacity2 = allocate2.capacity();
        allocate2.limit(capacity2);
        allocate2.position(capacity2);
        this.b = allocate;
        this.c = allocate2;
    }

    public final int a(AudioTrack audioTrack) {
        int i = this.e;
        int i2 = this.d;
        if (i - i2 > 0) {
            this.b.position(i2);
            ByteBuffer byteBuffer = this.b;
            int i3 = this.e;
            int i4 = this.a;
            byteBuffer.limit(Math.min(i3, i4));
            ByteBuffer byteBuffer2 = this.b;
            int write = audioTrack.write(byteBuffer2, byteBuffer2.limit() - this.b.position(), 1);
            if (write != 0) {
                int i5 = this.d + write;
                this.d = i5;
                if (i5 == i4) {
                    ByteBuffer byteBuffer3 = this.c;
                    this.c = this.b;
                    this.b = byteBuffer3;
                    this.d = 0;
                    this.e -= i4;
                }
                return a(audioTrack) + write;
            }
        }
        return 0;
    }
}

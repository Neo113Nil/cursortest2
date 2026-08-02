package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.audio.AudioMessageSource;
import java.io.File;
import xsna.uv4;

/* compiled from: AudioRecordObserver.java */
/* loaded from: classes15.dex */
public final class xu4 implements yu4 {
    public final /* synthetic */ uv4.a a;

    /* compiled from: AudioRecordObserver.java */
    public class a implements Runnable {
        public final /* synthetic */ String b;
        public final /* synthetic */ Exception c;

        public a(String str, Exception exc) {
            this.b = str;
            this.c = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            xu4.this.a.b(this.c, this.b);
        }
    }

    /* compiled from: AudioRecordObserver.java */
    public class b implements Runnable {
        public final /* synthetic */ String b;
        public final /* synthetic */ File c;
        public final /* synthetic */ boolean d;

        public b(String str, File file, boolean z) {
            this.b = str;
            this.c = file;
            this.d = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            xu4.this.a.a(this.b, this.c, this.d);
        }
    }

    /* compiled from: AudioRecordObserver.java */
    public class c implements Runnable {
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ double d;

        public c(String str, long j, double d) {
            this.b = str;
            this.c = j;
            this.d = d;
        }

        @Override // java.lang.Runnable
        public final void run() {
            xu4.this.a.c(this.b, this.c, this.d);
        }
    }

    /* compiled from: AudioRecordObserver.java */
    public class d implements Runnable {
        public final /* synthetic */ String b;
        public final /* synthetic */ File c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ long g;
        public final /* synthetic */ byte[] h;
        public final /* synthetic */ AudioMessageSource i;

        public d(String str, File file, boolean z, boolean z2, boolean z3, long j, byte[] bArr, AudioMessageSource audioMessageSource) {
            this.b = str;
            this.c = file;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = j;
            this.h = bArr;
            this.i = audioMessageSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            xu4.this.a.d(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }
    }

    public xu4(uv4.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.yu4
    public final void a(@NonNull String str, File file, boolean z) {
        pro0.e(new b(str, file, z));
    }

    @Override // xsna.yu4
    public final void b(Exception exc, @Nullable String str) {
        pro0.e(new a(str, exc));
    }

    @Override // xsna.yu4
    public final void c(@NonNull String str, long j, double d2) {
        pro0.e(new c(str, j, d2));
    }

    @Override // xsna.yu4
    public final void d(@NonNull String str, File file, boolean z, boolean z2, boolean z3, long j, byte[] bArr, AudioMessageSource audioMessageSource) {
        pro0.e(new d(str, file, z, z2, z3, j, bArr, audioMessageSource));
    }
}

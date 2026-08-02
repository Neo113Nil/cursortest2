package xsna;

/* compiled from: RxFileDownloader.java */
/* loaded from: classes17.dex */
public final class eug0 implements io.reactivex.rxjava3.functions.e {
    public final /* synthetic */ okhttp3.u b;

    /* compiled from: RxFileDownloader.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                eug0.this.b.close();
            } catch (Exception unused) {
            }
        }
    }

    public eug0(okhttp3.u uVar) {
        this.b = uVar;
    }

    @Override // io.reactivex.rxjava3.functions.e
    public final void cancel() throws Exception {
        asu0.a.getClass();
        asu0.q().submit(new a());
    }
}

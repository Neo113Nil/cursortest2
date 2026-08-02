package xsna;

import com.vk.folders.impl.model.FoldersListLoaderStateEvents;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;

/* compiled from: FoldersComponentReporterImpl.kt */
/* loaded from: classes18.dex */
public final class l0s implements k0s {
    public final mdz<OpenChatListReporter.Span> a;
    public final OpenChatListReporter b;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public final bpn0 d = new bpn0(new l9h(this, 17));
    public final otm e;

    /* compiled from: FoldersComponentReporterImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FoldersListLoaderStateEvents.LoaderStateEvent.values().length];
            try {
                iArr[FoldersListLoaderStateEvents.LoaderStateEvent.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FoldersListLoaderStateEvents.LoaderStateEvent.LoadingFinished.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FoldersListLoaderStateEvents.LoaderStateEvent.StartedLoading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public l0s(mdz<OpenChatListReporter.Span> mdzVar, OpenChatListReporter openChatListReporter, i2n0 i2n0Var) {
        this.a = mdzVar;
        this.b = openChatListReporter;
        this.e = new otm(mdzVar, openChatListReporter, i2n0Var);
    }

    @Override // xsna.k0s
    public final void a(c1s c1sVar) {
        io.reactivex.rxjava3.disposables.b bVar = this.c;
        bVar.e();
        bVar.b(io.reactivex.rxjava3.kotlin.c.f(3, c1sVar.i(), null, null, new t9e(this, 21)));
    }

    @Override // xsna.k0s
    public final jtm p2() {
        return this.e;
    }
}

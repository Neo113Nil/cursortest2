package xsna;

import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.r070;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class h9b implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h9b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                i9b i9bVar = (i9b) this.c;
                i9bVar.i.c(i9bVar.f.getString(R.string.vkim_channels_unarchived), new d7k0(R.string.vkim_channels_profile_cancel, new qm1(i9bVar, 16)));
                break;
            case 1:
                afm afmVar = (afm) this.c;
                afmVar.v = null;
                dfm dfmVar = afmVar.z;
                if (dfmVar != null) {
                    dfmVar.k();
                    break;
                }
                break;
            case 2:
                ((FunctionReferenceImpl) this.c).invoke(r070.f.C3588f.b);
                break;
            case 3:
                ((feb0) this.c).c = null;
                break;
            default:
                ((com.vk.voip.ui.hint.a) this.c).c();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h9b(izs izsVar) {
        this.b = 2;
        this.c = (FunctionReferenceImpl) izsVar;
    }
}

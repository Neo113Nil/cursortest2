package defpackage;

import androidx.compose.runtime.l;
import com.yandex.go.ugc.f;

/* loaded from: classes10.dex */
public final class fui0 extends d7 implements mse {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fui0(ytd ytdVar, l lVar) {
        super(lse.a);
        this.b = ytdVar;
        this.c = lVar;
    }

    @Override // defpackage.mse
    public final void handleException(fse fseVar, Throwable th) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                l lVar = (l) obj;
                kpb1.d(th, new jhd(2, (ytd) obj2, lVar));
                fse fseVar2 = lVar.b;
                lse lseVar = lse.a;
                mse mseVar = (mse) fseVar2.get(lseVar);
                if (mseVar != null) {
                    mseVar.handleException(fseVar, th);
                    return;
                }
                mse mseVar2 = (mse) lVar.a.get(lseVar);
                if (mseVar2 == null) {
                    throw th;
                }
                mseVar2.handleException(fseVar, th);
                return;
            default:
                f fVar = (f) obj2;
                fVar.getClass();
                jst.e.k(th, "Ugc.Error");
                fVar.I.q((String) obj);
                fVar.r(new qu(9));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fui0(f fVar, String str) {
        super(lse.a);
        this.b = fVar;
        this.c = str;
    }
}

package defpackage;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.shortcuts.impl.view.adapter.g;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class beu implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ beu(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        g gVar = this.b;
        switch (i) {
            case 0:
                gVar.e0.setTrailIcon((BitmapDrawable) obj).invalidateComponent();
                break;
            default:
                gVar.e0.setLeadImage((BitmapDrawable) obj).invalidateComponent();
                break;
        }
        return zy11Var;
    }
}

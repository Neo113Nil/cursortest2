package xsna;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.vk.newsfeed.common.presentation.model.items.MyTargetNativeAdSinglePartUiDto;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import xsna.gfw;
import xsna.iut0;
import xsna.qn60;
import xsna.uon0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class d4n implements io.reactivex.rxjava3.core.a0, gfw.a, weq, uon0.a, iut0.m {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d4n(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (xsna.ify.e(xsna.ify.c) == false) goto L10;
     */
    @Override // xsna.iut0.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a() {
        boolean z;
        sbs0 sbs0Var = (sbs0) this.b;
        u390 u390Var = (u390) this.c;
        u390 u390Var2 = sbs0Var.e;
        if (u390Var2 != null) {
            z = true;
            if (u390Var2.i.isShowing()) {
                int i = ify.a;
            }
        }
        z = false;
        if (z) {
            u390Var.dismiss();
            sbs0Var.d.invoke();
        }
        return z;
    }

    @Override // xsna.gfw.a
    public void b(mzi0 mzi0Var) {
        gfw gfwVar = (gfw) this.b;
        xme0 xme0Var = (xme0) this.c;
        Rect rect = gfwVar.i;
        if (rect != null) {
            synchronized (mzi0Var) {
                if (rect != null) {
                    Rect rect2 = new Rect(rect);
                    if (!rect2.intersect(0, 0, mzi0Var.getWidth(), mzi0Var.getHeight())) {
                        rect2.setEmpty();
                    }
                }
            }
        }
        xme0Var.b(mzi0Var);
    }

    @Override // xsna.weq
    public boolean c(String str, List list) {
        wjz0 content;
        vul vulVar;
        hs50 hs50Var = (hs50) this.b;
        MyTargetNativeAdSinglePartUiDto myTargetNativeAdSinglePartUiDto = (MyTargetNativeAdSinglePartUiDto) this.c;
        if (!list.contains("vk") && !list.contains("lead_form") && !list.contains("vk_miniapp")) {
            return false;
        }
        gd60 a = hd60.a();
        Context context = hs50Var.itemView.getContext();
        gjx gjxVar = myTargetNativeAdSinglePartUiDto.j;
        a.I0(context, (gjxVar == null || (content = gjxVar.getContent()) == null || (vulVar = content.c) == null) ? null : (String) vulVar.c, str, list, hs50Var.getAbsoluteAdapterPosition());
        return true;
    }

    @Override // xsna.uon0.a
    public Object execute() {
        qdq0 qdq0Var = (qdq0) this.b;
        Iterator it = ((HashMap) this.c).entrySet().iterator();
        while (it.hasNext()) {
            qdq0Var.i.o(((Integer) r2.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        qn60 qn60Var = (qn60) this.b;
        qn60.b[] bVarArr = (qn60.b[]) this.c;
        Object f = qn60Var.f((qn60.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        if (!(f instanceof Result.Failure)) {
            yVar.onSuccess((qn60.c) f);
        }
        Throwable a = Result.a(f);
        if (a != null) {
            yVar.onError(a);
        }
    }
}

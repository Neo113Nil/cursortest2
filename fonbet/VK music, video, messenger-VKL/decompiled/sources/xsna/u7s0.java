package xsna;

import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.offline.DownloadHelper;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.kr10;
import xsna.npl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class u7s0 implements Runnable {
    public final /* synthetic */ v7s0 b;
    public final /* synthetic */ ay8 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ k7s0 e;
    public final /* synthetic */ int f;

    public /* synthetic */ u7s0(v7s0 v7s0Var, ay8 ay8Var, String str, k7s0 k7s0Var, int i) {
        this.b = v7s0Var;
        this.c = ay8Var;
        this.d = str;
        this.e = k7s0Var;
        this.f = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v7s0 v7s0Var = this.b;
        v7s0Var.f.set(true);
        kr10.b.a aVar = new kr10.b.a();
        com.google.common.collect.h hVar = com.google.common.collect.h.h;
        ImmutableList.b bVar = ImmutableList.c;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        List list = Collections.EMPTY_LIST;
        com.google.common.collect.g gVar2 = com.google.common.collect.g.f;
        kr10.e.a aVar2 = new kr10.e.a();
        kr10.g gVar3 = kr10.g.a;
        ay8 ay8Var = this.c;
        String str = ay8Var.d;
        str.getClass();
        Uri uri = ay8Var.b;
        String str2 = this.d;
        kr10 kr10Var = new kr10(str, new kr10.c(aVar), uri != null ? new kr10.f(uri, str2, null, list, null, gVar2, C.TIME_UNSET) : null, new kr10.e(aVar2), vr10.B, gVar3);
        DownloadHelper.c cVar = new DownloadHelper.c();
        k7s0 k7s0Var = this.e;
        cVar.a = k7s0Var.e;
        cVar.c = npl.d.I;
        Context context = v7s0Var.a;
        ArrayList arrayList = new ArrayList();
        r rVar = new r(20);
        fn80 fn80Var = new fn80(context, arrayList, false);
        fn80Var.c = true;
        fn80Var.d = new v6j(rVar);
        cVar.b = fn80Var;
        DownloadHelper a = cVar.a(kr10Var);
        a.j(new y7s0(k7s0Var, v7s0Var, ay8Var, a, this.f, str2));
    }
}

package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.vk.core.apps.BuildInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vkontakte.android.R;

/* compiled from: ChatProfileMembersComponent.kt */
/* loaded from: classes2.dex */
public final class hxb extends txb {
    public final Context j;
    public final cxb k;
    public final ixb l;
    public final otb m;

    public hxb(Context context, DialogExt dialogExt, kkm kkmVar, a1w a1wVar, mxv mxvVar, cxb cxbVar) {
        super(kkmVar);
        this.j = context;
        this.k = cxbVar;
        mxvVar.getClass();
        this.l = new ixb(this, kkmVar, n0v0.a);
        otb otbVar = new otb(dialogExt, a1wVar.q(), mxvVar, a1wVar, new com.vk.voip.ui.menu.feature.a(this, 19));
        if (otbVar.l.d) {
            otbVar.g();
        }
        if (dialogExt.e != 0) {
            otbVar.f(dialogExt);
        }
        this.m = otbVar;
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        ixb ixbVar = this.l;
        ixbVar.getClass();
        View inflate = layoutInflater.inflate(R.layout.vkim_chat_profile_chat_members, viewGroup, false);
        ixbVar.d = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.vkim_chat_profile_chat_members__rv);
        layoutInflater.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        pwb pwbVar = new pwb(ixbVar.c, ixbVar.a, ixbVar.b);
        ixbVar.j = pwbVar;
        recyclerView.setAdapter(pwbVar);
        recyclerView.setHasFixedSize(true);
        ixbVar.e = recyclerView;
        ixbVar.i = new s7j(recyclerView);
        ixbVar.f = (ProgressWheel) inflate.findViewById(R.id.vkim_chat_profile_chat_members__progress);
        ixbVar.g = (TextView) inflate.findViewById(R.id.vkim_chat_profile_chat_members__error_tv);
        jjc.g((Button) inflate.findViewById(R.id.vkim_chat_profile_chat_members__error_retry), new com.vk.movika.sdk.base.logic.interactor.p(ixbVar, 19));
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.vkim_chat_profile_chat_members__error_container);
        ixbVar.h = viewGroup2;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        f4m.j(viewGroup2);
        RecyclerView recyclerView2 = ixbVar.e;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        f4m.j(recyclerView2);
        ProgressWheel progressWheel = ixbVar.f;
        (progressWheel != null ? progressWheel : null).setVisibility(0);
        return inflate;
    }

    @Override // xsna.j8i
    public final void M0() {
        otb otbVar = this.m;
        if (otbVar.l.d) {
            otbVar.g();
        }
        otbVar.d.f();
    }

    @Override // xsna.txb, xsna.j8i
    public final void S0(View view) {
        X0();
        otb otbVar = this.m;
        I0(otbVar.j.subscribe(new j50(new i50(this, 11), 10), kwg0.b()));
        I0(otbVar.k.subscribe(new sh6(new d7(this, 22), 8), kwg0.b()));
    }

    @Override // xsna.txb
    public final void X0() {
        kkm kkmVar = this.i;
        if (kkmVar != null) {
            ixb ixbVar = this.l;
            ixbVar.getClass();
            if (BuildInfo.t()) {
                ProgressWheel progressWheel = ixbVar.f;
                (progressWheel != null ? progressWheel : null).setBarColor(dhr0.t.c(R.attr.vk_legacy_accent));
            } else {
                ProgressWheel progressWheel2 = ixbVar.f;
                kkmVar.a(progressWheel2 != null ? progressWheel2 : null, "progressTint", new lz0(kkmVar, 27));
            }
        }
    }

    @Override // xsna.txb
    public final String Y0() {
        return this.j.getString(R.string.vkim_chat_profile_members_tab_title);
    }

    @Override // xsna.txb
    public final void Z0(int i) {
        ixb ixbVar = this.l;
        if (ixbVar.d != null) {
            float height = r1.getHeight() / 2.0f;
            float min = Math.min(height - (i / 2.0f), height - ixb.k);
            ViewGroup viewGroup = ixbVar.h;
            if (viewGroup == null) {
                viewGroup = null;
            }
            float f = -min;
            viewGroup.setTranslationY(f);
            ProgressWheel progressWheel = ixbVar.f;
            (progressWheel != null ? progressWheel : null).setTranslationY(f);
        }
    }

    @Override // xsna.txb
    public final void a1(int i, int[] iArr) {
        s7j s7jVar = this.l.i;
        if (s7jVar == null) {
            s7jVar = null;
        }
        s7jVar.c = 0;
        s7jVar.d = 0;
        s7jVar.b.scrollBy(0, i);
        iArr[0] = s7jVar.c;
        iArr[1] = s7jVar.d;
    }

    @Override // xsna.txb
    public final void b1() {
        kkm kkmVar = this.i;
        if (kkmVar != null) {
            ixb ixbVar = this.l;
            ixbVar.getClass();
            if (BuildInfo.t()) {
                return;
            }
            ProgressWheel progressWheel = ixbVar.f;
            if (progressWheel == null) {
                progressWheel = null;
            }
            kkmVar.h(progressWheel);
        }
    }
}

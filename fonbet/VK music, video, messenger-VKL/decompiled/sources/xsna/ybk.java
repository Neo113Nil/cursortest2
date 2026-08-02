package xsna;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.vk.profile.community.creationonboarding.api.models.CommunityCreationOnboardingFinishArguments;
import com.vk.profile.community.creationonboarding.api.models.CreationOnboardingArguments;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.bck;
import xsna.fck;
import xsna.h7u0;
import xsna.nzg;

/* compiled from: CreationOnboardingRouterImpl.kt */
/* loaded from: classes5.dex */
public final class ybk implements xbk {
    @Override // xsna.xbk
    public final void a(Context context, CommunityCreationOnboardingFinishArguments communityCreationOnboardingFinishArguments) {
        new nzg.a(context, communityCreationOnboardingFinishArguments).I0("community_creation_onboarding_dialog");
    }

    @Override // xsna.xbk
    public final void b(Context context, boolean z, final defpackage.b0 b0Var) {
        h7u0.a aVar;
        final bck bckVar = new bck();
        androidx.appcompat.app.d dVar = bckVar.a;
        if (dVar != null) {
            dVar.dismiss();
        }
        if (z) {
            Integer valueOf = Integer.valueOf(R.string.community_close_creation_onboarding_skip);
            abg0 abg0Var = dhr0.t;
            bck.a aVar2 = new bck.a(e43.l(new Pair(valueOf, Integer.valueOf(abg0Var.c(R.attr.vk_ui_text_negative))), new Pair(Integer.valueOf(R.string.community_close_creation_onboarding_skip_all), Integer.valueOf(abg0Var.c(R.attr.vk_ui_text_negative))), new Pair(Integer.valueOf(R.string.community_close_creation_onboarding_cancel), Integer.valueOf(abg0Var.c(R.attr.vk_ui_text_primary)))));
            aVar = new h7u0.a(context);
            aVar.g0(R.string.community_close_creation_onboarding_title);
            aVar.U(R.string.community_close_creation_onboarding_message);
            aVar.T(null, null);
            ListView listView = new ListView(context);
            listView.setAdapter((ListAdapter) aVar2);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: xsna.zbk
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    defpackage.b0 b0Var2 = defpackage.b0.this;
                    if (i == 0) {
                        b0Var2.invoke(Boolean.FALSE);
                    } else if (i == 1) {
                        b0Var2.invoke(Boolean.TRUE);
                    }
                    androidx.appcompat.app.d dVar2 = bckVar.a;
                    if (dVar2 != null) {
                        dVar2.dismiss();
                    }
                }
            });
            aVar.f = listView;
        } else {
            h7u0.a aVar3 = new h7u0.a(context);
            aVar3.g0(R.string.community_close_creation_onboarding_title);
            aVar3.U(R.string.community_close_creation_onboarding_message);
            aVar3.W(R.string.community_close_creation_onboarding_skip, new tbj(b0Var, 1));
            aVar3.c0(R.string.community_close_creation_onboarding_cancel, new ack());
            aVar = aVar3;
        }
        bckVar.a = aVar.m();
    }

    @Override // xsna.xbk
    public final void c(Context context, CreationOnboardingArguments creationOnboardingArguments, bhh bhhVar) {
        new fck.a(context, creationOnboardingArguments, bhhVar).I0("community_creation_onboarding_dialog");
    }
}

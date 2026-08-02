package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.components.search.BaseVkSearchView;
import com.vk.core.view.search.RoundedSearchView;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import xsna.yyb;

/* compiled from: VhMembersSearch.kt */
/* loaded from: classes2.dex */
public final class jsr0 extends kqr0<yyb.i> {
    public final jj0 l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jsr0(jj0 jj0Var, ViewGroup viewGroup) {
        super(com.vk.toggle.b.A.a(r0) ? R.layout.vkim_chat_settings_members_search_v2 : R.layout.vkim_chat_settings_members_search, viewGroup);
        g2v.c().getClass();
        n0v0.a.getClass();
        ImFeatures imFeatures = ImFeatures.IM_CHAT_PROFILE_MEMBERS_COMPONENT_REDESIGN;
        imFeatures.getClass();
        this.l = jj0Var;
        ImFeatures imFeatures2 = ImFeatures.IM_CHAT_PROFILE_MEMBERS_COMPONENT_REDESIGN;
        imFeatures2.getClass();
        if (!com.vk.toggle.b.A.a(imFeatures2)) {
            View findViewById = this.itemView.findViewById(R.id.vkim_chat_settings_members_search);
            RoundedSearchView roundedSearchView = (RoundedSearchView) findViewById;
            roundedSearchView.setVoiceIsAvailable(false);
            roundedSearchView.setOnTextChangedListener(new b3m0(this, 11));
            return;
        }
        View findViewById2 = this.itemView.findViewById(R.id.vkim_chat_settings_members_search_v2);
        BaseVkSearchView baseVkSearchView = (BaseVkSearchView) findViewById2;
        baseVkSearchView.setVoiceInputEnabled(false);
        baseVkSearchView.X4(false);
        hg1.b(this.itemView, d02.y(baseVkSearchView, 300L, 2).U(new i630(new pmp0(3), 18)).subscribe(new y730(new alj0(this, 18), 20), new lem(new epj0(10), 2)));
    }
}

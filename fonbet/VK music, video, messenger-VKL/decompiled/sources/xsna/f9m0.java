package xsna;

import android.view.View;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.core.view.components.check.VkCheckCircle;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vkontakte.android.R;
import java.util.List;
import xsna.w9m0;

/* compiled from: StoryPrivacyCloseFriendsItemHolder.kt */
/* loaded from: classes16.dex */
public final class f9m0 extends vfz<w9m0.a> {
    public final izs<a9m0, s3q0> l;
    public final VkText m;
    public final View n;
    public final VkUserStack o;
    public final VkText p;
    public final VkCheckCircle q;
    public final View r;

    public f9m0(View view, svk0 svk0Var) {
        super(view);
        this.l = svk0Var;
        this.m = (VkText) view.findViewById(R.id.title);
        this.n = view.findViewById(R.id.subtitle_container);
        this.o = (VkUserStack) view.findViewById(R.id.user_stack);
        this.p = (VkText) view.findViewById(R.id.user_stack_caption);
        this.q = (VkCheckCircle) view.findViewById(R.id.checkbox);
        this.r = view.findViewById(R.id.chevron);
    }

    @Override // xsna.vfz
    public final void W5(w9m0.a aVar) {
        w9m0.a aVar2 = aVar;
        List<ayv0> list = aVar2.e;
        int i = aVar2.j;
        this.itemView.setOnClickListener(new te5(7, this, aVar2));
        View view = this.itemView;
        view.setBackground(e3m.e(R.attr.selectableItemBackground, view.getContext()));
        a6u a6uVar = new a6u(3, this, aVar2);
        View view2 = this.n;
        view2.setOnClickListener(a6uVar);
        view2.setBackground(e3m.e(R.attr.selectableItemBackground, this.itemView.getContext()));
        String string = this.itemView.getContext().getString(R.string.story_privacy_selector_best_friend);
        VkText vkText = this.m;
        vkText.setText(string);
        boolean z = aVar2.c;
        int i2 = z ? 0 : 8;
        VkCheckCircle vkCheckCircle = this.q;
        vkCheckCircle.setVisibility(i2);
        vkCheckCircle.setChecked(z);
        this.r.setVisibility((aVar2.b == StoryPrivacyType.BEST_FRIENDS && i == 0) ? 0 : 8);
        this.itemView.setAlpha(aVar2.i ? 0.4f : 1.0f);
        view2.setVisibility(i > 0 ? 0 : 8);
        this.p.setText(enj.f(R.plurals.friends_quantity, i, this.itemView.getContext()));
        if (list.isEmpty()) {
            view2.setVisibility(8);
            f4m.y(iah0.a(0), vkText);
        } else {
            this.o.setAvatars(list);
            f4m.y(iah0.a(8), vkText);
        }
    }
}

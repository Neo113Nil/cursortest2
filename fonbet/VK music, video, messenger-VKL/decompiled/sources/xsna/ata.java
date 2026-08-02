package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.gta;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ata implements izs {
    public final /* synthetic */ gta b;
    public final /* synthetic */ StoryPrivacyType c;
    public final /* synthetic */ StoryEntry d;
    public final /* synthetic */ po6 e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ ata(gta gtaVar, StoryPrivacyType storyPrivacyType, StoryEntry storyEntry, po6 po6Var, boolean z) {
        this.b = gtaVar;
        this.c = storyPrivacyType;
        this.d = storyEntry;
        this.e = po6Var;
        this.f = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        StoryBottomViewGroup storyBottomViewGroup;
        Activity w;
        gta gtaVar = this.b;
        gtaVar.getClass();
        int i = gta.a.$EnumSwitchMapping$0[this.c.ordinal()];
        StoryEntry storyEntry = this.d;
        int i2 = 0;
        switch (i) {
            case 1:
                storyEntry.p = false;
                storyEntry.w0 = false;
                storyEntry.K = false;
                if (this.f) {
                    i2 = R.string.story_privacy_all;
                    break;
                }
                break;
            case 2:
                storyEntry.p = false;
                storyEntry.w0 = false;
                storyEntry.K = true;
                i2 = R.string.story_privacy_friends;
                break;
            case 3:
                storyEntry.p = false;
                storyEntry.w0 = true;
                storyEntry.K = true;
                i2 = R.string.story_privacy_best_friends;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        po6 po6Var = this.e;
        po6Var.X0(po6Var.r);
        if (i2 != 0 && (storyBottomViewGroup = gtaVar.c) != null && (w = bwt0.w(storyBottomViewGroup)) != null) {
            Context context = storyBottomViewGroup.getContext();
            lpj lpjVar = context instanceof lpj ? (lpj) context : null;
            Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
            dhr0.a.getClass();
            int i3 = dhr0.u().c;
            if (valueOf == null || valueOf.intValue() != i3) {
                context = new l7s(context, dhr0.u().c);
            }
            ikv0.a aVar = new ikv0.a(context);
            aVar.u = new ikv0.d(context.getString(i2), (String) null, (ikv0.d.a) null, 6);
            aVar.o = Integer.valueOf(cn70.b(154) - iah0.h(w, true));
            aVar.l = 80;
            pkv0.f(aVar);
        }
        return s3q0.a;
    }
}

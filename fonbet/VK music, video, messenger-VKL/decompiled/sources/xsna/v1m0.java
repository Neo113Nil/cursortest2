package xsna;

import android.content.Context;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.d9m0;

/* compiled from: StoryEditorRouterImpl.kt */
/* loaded from: classes16.dex */
public final class v1m0 implements u1m0 {
    @Override // xsna.u1m0
    public final void a(Context context, hed0 hed0Var, g9m0 g9m0Var, boolean z, zzs<? super StoryPrivacyType, ? super StoryPrivacyType, ? super List<UserId>, ? super List<UserId>, s3q0> zzsVar) {
        StoryPrivacyType storyPrivacyType = hed0Var.a;
        StoryPrivacyType storyPrivacyType2 = hed0Var.b;
        q9m0 q9m0Var = hed0Var.c;
        new d9m0.a(context, storyPrivacyType, storyPrivacyType2, q9m0Var.a, q9m0Var.b, q9m0Var.c, zzsVar, new com.vk.movika.sdk.base.flow.binding.j(this, context, g9m0Var), z).I0("StoryPrivacyBottomSheet");
    }
}

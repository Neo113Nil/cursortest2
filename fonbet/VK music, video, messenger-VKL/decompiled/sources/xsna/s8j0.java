package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e9j0;

/* compiled from: ShareStoryReducer.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class s8j0 extends FunctionReferenceImpl implements izs<c9j0, e9j0.b> {
    @Override // xsna.izs
    public final e9j0.b invoke(c9j0 c9j0Var) {
        c9j0 c9j0Var2 = c9j0Var;
        ((u8j0) this.receiver).getClass();
        return fkq0.d(c9j0Var2.b) ? new e9j0.b(c9j0Var2.c, false) : new e9j0.b(StoryPrivacyType.ALL, true);
    }
}

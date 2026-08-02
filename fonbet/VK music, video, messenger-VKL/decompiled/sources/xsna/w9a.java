package xsna;

import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class w9a implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w9a(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                v0r v0rVar = (v0r) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-464081564, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:96)");
                    }
                    v0rVar.n("имя + многострочный текст", aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                i1b0 i1b0Var = (i1b0) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-937628627, intValue2, -1, "com.vk.music.bottomsheets.equalizer.PlayerEqualizerSettingsMviView.LandscapeOrientationContent.<anonymous>.<anonymous>.<anonymous> (PlayerEqualizerSettingsMviView.kt:179)");
                    }
                    i1b0Var.l(s200.E(txj0.f(q630.a.a, 1.0f), 16, 14), aVar2, 70);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}

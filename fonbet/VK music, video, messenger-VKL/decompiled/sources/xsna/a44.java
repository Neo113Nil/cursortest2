package xsna;

import com.vk.ads.easypromote.impl.di.EasyPromoteComponentImpl;
import com.vk.camera.clips.api.stub.CameraClipsComponentStub;
import com.vk.clips.coauthors.di.ClipsCoauthorsInternalComponent;
import com.vk.clips.internal.nps.impl.di.ClipsInternalNpsComponentImpl;
import com.vk.common.links.generator.impl.di.LinksGeneratorComponentImpl;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.ecomm.checklist.impl.di.MarketChecklistComponentImpl;
import com.vk.ecomm.moderation.api.di.ModerationComponent$Companion$STUB$1;
import com.vk.toggle.features.CatalogFeatures;
import com.vk.video.music.dialog.api.di.MusicInVideoDialogComponent;
import java.io.File;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class a44 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ a44(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        PrivateFiles.a b;
        switch (this.b) {
            case 3:
                qcy<Object>[] qcyVarArr = CameraClipsComponentStub.h;
                break;
            case 6:
                qcy<Object>[] qcyVarArr2 = ClipsCoauthorsInternalComponent.c;
                break;
            case 8:
                qcy<Object>[] qcyVarArr3 = ClipsInternalNpsComponentImpl.g;
                break;
            case 12:
                b = e8r.a.b(r2, PrivateSubdir.CHAT_BACKGROUNDS.h(), true);
                File file = b.a;
                file.mkdirs();
                break;
            case 14:
                pqo pqoVar = sfo.a;
                break;
            case 15:
                qcy<Object>[] qcyVarArr4 = EasyPromoteComponentImpl.c;
                break;
            case 18:
                CatalogFeatures catalogFeatures = CatalogFeatures.COM_FRIENDS;
                break;
            case 22:
                qcy<Object>[] qcyVarArr5 = LinksGeneratorComponentImpl.f;
                break;
            case 23:
                qcy<Object>[] qcyVarArr6 = MarketChecklistComponentImpl.b;
                break;
            case 25:
                qcy<Object>[] qcyVarArr7 = ModerationComponent$Companion$STUB$1.f;
                break;
            case 26:
                MusicInVideoDialogComponent.Companion companion = MusicInVideoDialogComponent.Companion;
                break;
        }
        return s3q0.a;
    }
}

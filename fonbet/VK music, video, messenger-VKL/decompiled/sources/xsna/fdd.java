package xsna;

import android.graphics.Bitmap;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.entities.stat.BackgroundInfo;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.dto.stories.model.StoryUploadType;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.media.MediaUtils;
import com.vk.media.entities.StoryEditorParams;
import com.vk.media.model.CameraVideoEncoderParameters;
import com.vk.stat.model.builders.aggregate.AggregateEventBuilder;
import com.vk.stat.model.builders.aggregate.AggregateEventKey;
import com.vk.story.api.domain.interactor.upload.StoryMultiData;
import com.vk.story.api.media.StoryMediaData;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import xsna.tam0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class fdd implements izs {
    public final /* synthetic */ kdd b;
    public final /* synthetic */ nov c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ClipVideoFile e;
    public final /* synthetic */ String f;

    public /* synthetic */ fdd(kdd kddVar, r4g0 r4g0Var, String str, ClipVideoFile clipVideoFile, String str2) {
        this.b = kddVar;
        this.c = r4g0Var;
        this.d = str;
        this.e = clipVideoFile;
        this.f = str2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        r4g0 r4g0Var = (r4g0) this.c;
        tam0 b = tam0.a.b(false, null, null, false, 28);
        b.h.a(r4g0Var);
        Serializer.c<BackgroundInfo> cVar = BackgroundInfo.CREATOR;
        b.d = BackgroundInfo.a.b();
        b.t = (Bitmap) obj;
        StoryUploadParams storyUploadParams = new StoryUploadParams();
        storyUploadParams.f = StoryUploadParams.CameraType.REPOST;
        final kdd kddVar = this.b;
        yo9 b2 = kddVar.d.b(b, new MediaUtils.d(1080, 1920));
        storyUploadParams.j = b2 != null ? (ClickableStickers) b2.d : null;
        ClipVideoFile clipVideoFile = this.e;
        List<PrivacySetting.PrivacyRule> list = clipVideoFile.x0;
        PrivacyRules.PredefinedSet predefinedSet = PrivacyRules.h;
        if (list.contains(predefinedSet)) {
            str = predefinedSet.d;
        } else {
            List<PrivacySetting.PrivacyRule> list2 = clipVideoFile.x0;
            PrivacyRules.PredefinedSet predefinedSet2 = PrivacyRules.d;
            if (list2.contains(predefinedSet2)) {
                str = predefinedSet2.d;
            } else {
                List<PrivacySetting.PrivacyRule> list3 = clipVideoFile.x0;
                PrivacyRules.PredefinedSet predefinedSet3 = PrivacyRules.a;
                if (list3.contains(predefinedSet3)) {
                    str = predefinedSet3.d;
                } else {
                    Owner owner = clipVideoFile.v0;
                    if (owner == null || !fkq0.b(owner.b)) {
                        throw new IllegalStateException("Unsupported privacy: " + j5g.g0(clipVideoFile.x0, null, null, null, 0, null, 63));
                    }
                    str = predefinedSet2.d;
                }
            }
        }
        storyUploadParams.C = str;
        CameraVideoEncoderParameters a = kddVar.e.a(new i9(13), b, true);
        if (a == null) {
            AggregateEventBuilder aggregateEventBuilder = new AggregateEventBuilder(AggregateEventKey.CLIP_REPOST);
            aggregateEventBuilder.w(0, "Story upload failed: Encoder params factory return null");
            aggregateEventBuilder.q();
        } else {
            int i = a.w;
            if (i > 60000) {
                i = 60000;
            }
            a.w = i;
            long j = a.l;
            if (j > 60000) {
                j = 60000;
            }
            a.l = j;
            List singletonList = Collections.singletonList(new StoryMediaData(null, a, storyUploadParams, null));
            StoryEditorParams storyEditorParams = new StoryEditorParams(1080, 1920);
            CommonUploadParams commonUploadParams = new CommonUploadParams(kddVar.b.c(), true, null, null, null, null, null, null, null, StoryUploadType.PUBLISH_NOW, null, false, null, false, null, null, 65020, null);
            Owner owner2 = clipVideoFile.v0;
            if (owner2 != null && fkq0.b(owner2.b)) {
                commonUploadParams.e = fkq0.e(owner2.b);
            }
            commonUploadParams.o = false;
            commonUploadParams.h = "REPOST_AUTO_TO_STORY_ACTIVITY".toLowerCase(Locale.ROOT);
            commonUploadParams.j = this.f;
            final int b3 = kddVar.c.b(new StoryMultiData(singletonList, storyEditorParams, commonUploadParams, 0, null, 24, null));
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            final String str2 = this.d;
            bd70 bd70Var = new bd70() { // from class: xsna.hdd
                @Override // xsna.bd70
                public final void x0(int i2, int i3, Object obj2) {
                    zjm0 zjm0Var = (zjm0) obj2;
                    if (zjm0Var.b == b3) {
                        kdd kddVar2 = kddVar;
                        kddVar2.b(str2, linkedHashSet);
                        kddVar2.g.d(zjm0Var.g.Gb());
                    }
                }
            };
            linkedHashSet.add(bd70Var);
            bd70 bd70Var2 = new bd70() { // from class: xsna.idd
                @Override // xsna.bd70
                public final void x0(int i2, int i3, Object obj2) {
                    if (((zjm0) obj2).b == b3) {
                        kddVar.b(str2, linkedHashSet);
                    }
                }
            };
            linkedHashSet.add(bd70Var2);
            bd70 bd70Var3 = new bd70() { // from class: xsna.jdd
                @Override // xsna.bd70
                public final void x0(int i2, int i3, Object obj2) {
                    int i4 = ((zjm0) obj2).b;
                    int i5 = b3;
                    if (i4 == i5) {
                        kddVar.g.b(i5);
                    }
                }
            };
            linkedHashSet.add(bd70Var3);
            p870 p870Var = kddVar.f;
            p870Var.b(102, bd70Var);
            p870Var.b(109, bd70Var2);
            p870Var.b(104, bd70Var3);
        }
        return s3q0.a;
    }
}

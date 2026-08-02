package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.clips.upload.model.ClipUploadParams;
import com.vk.clips.uploader.api.model.ClipUploaderData;
import com.vk.clips.uploader.api.model.ClipUploaderParams;
import com.vk.dto.clips.external.VideoToClipInfo;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.dto.clips.upload.ClipTemplateInfo;
import com.vk.dto.clips.upload.ShortVideoCreationFeature;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import com.vk.dto.common.clips.VideoTemplatePublishInfo;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ClipsSdkUploaderDataBuilderImpl.kt */
/* loaded from: classes17.dex */
public final class b3f implements a3f {
    public final b25 a;

    public b3f(b25 b25Var) {
        this.a = b25Var;
    }

    @Override // xsna.a3f
    public final ClipUploaderData a(ClipUploadData clipUploadData) {
        ArrayList arrayList;
        boolean z;
        ClipUploaderParams.LinkAttach linkAttach;
        ClipTemplateInfo clipTemplateInfo;
        boolean z2;
        ClipUploaderParams.TemplatePublishInfo templatePublishInfo;
        ArrayList arrayList2;
        String str;
        ClipUploadParams clipUploadParams = clipUploadData.b;
        ClipUploaderData.Author vkGroup = fkq0.c(clipUploadParams.f) ? new ClipUploaderData.Author.VkGroup(fkq0.a(clipUploadParams.f)) : new ClipUploaderData.Author.VkUser(this.a.c());
        ClipsEncoderParameters clipsEncoderParameters = clipUploadData.c;
        String str2 = clipUploadParams.e;
        ClipUploadParams.LicensedAudioInfo licensedAudioInfo = clipUploadParams.D;
        String str3 = licensedAudioInfo != null ? licensedAudioInfo.h : null;
        ClickableStickers clickableStickers = clipUploadParams.w;
        String jSONObject = clickableStickers != null ? clickableStickers.e5().toString() : null;
        List<MaskLight> list = clipUploadParams.u;
        if (list != null) {
            List<MaskLight> list2 = list;
            ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((MaskLight) it.next()).zb());
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        boolean z3 = clipUploadParams.g;
        boolean z4 = clipUploadParams.R;
        String str4 = clipUploadParams.i;
        List c0 = str4 != null ? drm0.c0(str4, new String[]{StringUtils.COMMA}, 0, 6) : null;
        String str5 = clipUploadParams.h;
        List c02 = str5 != null ? drm0.c0(str5, new String[]{StringUtils.COMMA}, 0, 6) : null;
        boolean z5 = clipUploadParams.j;
        String str6 = clipUploadParams.x;
        Integer num = clipUploadParams.F;
        String str7 = clipUploadParams.G;
        boolean z6 = clipUploadParams.k;
        int i = clipUploadParams.m;
        VideoToClipInfo videoToClipInfo = clipUploadParams.y;
        ClipsLinkAttachment clipsLinkAttachment = clipUploadParams.z;
        if (clipsLinkAttachment != null) {
            z = z5;
            linkAttach = new ClipUploaderParams.LinkAttach(clipsLinkAttachment.c, clipsLinkAttachment.b);
        } else {
            z = z5;
            linkAttach = null;
        }
        ClipTemplateInfo clipTemplateInfo2 = clipUploadParams.v;
        VideoTemplatePublishInfo videoTemplatePublishInfo = clipUploadParams.B;
        if (videoTemplatePublishInfo != null) {
            clipTemplateInfo = clipTemplateInfo2;
            z2 = z6;
            templatePublishInfo = new ClipUploaderParams.TemplatePublishInfo(videoTemplatePublishInfo.b, videoTemplatePublishInfo.c, videoTemplatePublishInfo.d);
        } else {
            clipTemplateInfo = clipTemplateInfo2;
            z2 = z6;
            templatePublishInfo = null;
        }
        OrdData ordData = clipUploadParams.C;
        ClipUploaderParams.OrdInfo ordInfo = ordData != null ? new ClipUploaderParams.OrdInfo(ordData.c, ordData.d, ordData.b) : null;
        List<? extends ShortVideoCreationFeature> list3 = clipUploadParams.A;
        if (list3 != null) {
            List<? extends ShortVideoCreationFeature> list4 = list3;
            ArrayList arrayList4 = new ArrayList(c5g.u(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((ShortVideoCreationFeature) it2.next()).h());
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        ClipUploaderParams clipUploaderParams = new ClipUploaderParams(str2, null, str3, jSONObject, arrayList, Boolean.valueOf(z3), Boolean.valueOf(clipUploadParams.T), Boolean.valueOf(z4), c0, c02, Boolean.valueOf(z), str6, num, str7, null, Boolean.valueOf(z2), null, null, Integer.valueOf(i), videoToClipInfo, linkAttach, clipTemplateInfo, templatePublishInfo, ordInfo, arrayList2, clipUploadParams.r, clipUploadParams.o, clipUploadParams.q, clipUploadParams.s, clipUploadParams.H, clipUploadParams.n, null, 131072, null);
        MobileOfficialAppsClipsStat$TypeClipUploadItem a = zgf.a(clipUploadParams);
        String str8 = clipUploadData.e;
        if (str8 == null) {
            ClipsDraftPersistentStore.b.getClass();
            ClipsDraftVk k = ClipsDraftPersistentStore.k();
            str = k != null ? k.b.b : null;
        } else {
            str = str8;
        }
        return new ClipUploaderData(clipsEncoderParameters, clipUploaderParams, a, vkGroup, str);
    }
}

package xsna;

import androidx.compose.runtime.a;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.feed.design.compose.posting.preview.spinner.PostingSpinnerSize;
import com.vk.feed.tool.view.posting.preview.attachment.PreviewAttachmentWrapper;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.domain.model.CropCarouselType;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$Editing$CropPhoto$SetCurrentRatio;
import com.vk.newsfeed.posting.impl.domain.model.PostingPreviewRatio;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingArticleDto;
import com.vk.newsfeed.posting.impl.domain.model.attachments.PostingLinkDto;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadDto;
import com.vk.newsfeed.posting.impl.presentation.model.PhotoDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.VideoDto;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.a1u0;

/* compiled from: PostMediaContent.kt */
/* loaded from: classes4.dex */
public final class r4c0 {
    public static final void a(final List list, final mdc0 mdc0Var, final PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData, final int i, final PostingLinkDto postingLinkDto, final PostingArticleDto postingArticleDto, final izs izsVar, final izs izsVar2, androidx.compose.runtime.a aVar, final int i2) {
        List list2;
        int i3;
        mdc0 mdc0Var2;
        PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData2;
        int i4;
        PostingLinkDto postingLinkDto2;
        androidx.compose.runtime.a M = aVar.M(-1743420823);
        if ((i2 & 6) == 0) {
            list2 = list;
            i3 = (M.J(list2) ? 4 : 2) | i2;
        } else {
            list2 = list;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            mdc0Var2 = mdc0Var;
            i3 |= M.J(mdc0Var2) ? 32 : 16;
        } else {
            mdc0Var2 = mdc0Var;
        }
        if ((i2 & 384) == 0) {
            photoVideoAttachmentsCropData2 = photoVideoAttachmentsCropData;
            i3 |= M.J(photoVideoAttachmentsCropData2) ? 256 : 128;
        } else {
            photoVideoAttachmentsCropData2 = photoVideoAttachmentsCropData;
        }
        if ((i2 & 3072) == 0) {
            i4 = i;
            i3 |= M.o(i4) ? 2048 : 1024;
        } else {
            i4 = i;
        }
        if ((i2 & 24576) == 0) {
            postingLinkDto2 = postingLinkDto;
            i3 |= M.J(postingLinkDto2) ? 16384 : 8192;
        } else {
            postingLinkDto2 = postingLinkDto;
        }
        if ((i2 & 196608) == 0) {
            i3 |= M.J(postingArticleDto) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= M.y(izsVar) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= M.y(izsVar2) ? 8388608 : 4194304;
        }
        if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1743420823, i3, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.step2.PostMediaContent (PostMediaContent.kt:27)");
            }
            boolean z = ((3670016 & i3) == 1048576) | ((29360128 & i3) == 8388608);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new rm0(24, izsVar, izsVar2);
                M.R(x);
            }
            izs izsVar3 = (izs) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new pyz(19);
                M.R(x2);
            }
            izs izsVar4 = (izs) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new qey(23);
                M.R(x3);
            }
            izs izsVar5 = (izs) x3;
            boolean z2 = ((i3 & 7168) == 2048) | ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 14) == 4) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072);
            Object x4 = M.x();
            if (z2 || x4 == c0012a) {
                final List list3 = list2;
                final mdc0 mdc0Var3 = mdc0Var2;
                final PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData3 = photoVideoAttachmentsCropData2;
                final int i5 = i4;
                final PostingLinkDto postingLinkDto3 = postingLinkDto2;
                x4 = new izs() { // from class: xsna.p4c0
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        List list4;
                        Object obj2;
                        PostingAttachment postingAttachment;
                        List list5;
                        List list6;
                        CropCarouselType cropCarouselType;
                        roc0 roc0Var = (roc0) obj;
                        c5d0 mediaView = roc0Var.getMediaView();
                        int i6 = mediaView.f;
                        int i7 = i5;
                        if (i6 != i7 && i7 > 0) {
                            mediaView.f = i7;
                            int b = an10.b(((((i7 - mediaView.k) / 2.0f) - mediaView.l) - mediaView.h) - mediaView.i);
                            int i8 = mediaView.j;
                            if (b < i8) {
                                b = i8;
                            }
                            pcc0 pcc0Var = mediaView.d;
                            if (pcc0Var != null) {
                                pcc0Var.Q0(b);
                            }
                        }
                        c5d0 mediaView2 = roc0Var.getMediaView();
                        PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData4 = photoVideoAttachmentsCropData3;
                        PostingPreviewRatio postingPreviewRatio = photoVideoAttachmentsCropData4.e;
                        vdc0 vdc0Var = new vdc0(postingPreviewRatio, com.vk.newsfeed.posting.impl.domain.model.c.d(photoVideoAttachmentsCropData4, postingPreviewRatio), photoVideoAttachmentsCropData4.d, 4);
                        mdc0 mdc0Var4 = mdc0Var3;
                        mediaView2.c = mdc0Var4;
                        pcc0 pcc0Var2 = mediaView2.d;
                        if (pcc0Var2 != null) {
                            pcc0Var2.P0(vdc0Var);
                        }
                        if (pcc0Var2 != null) {
                            PhotoVideoDisplayMode photoVideoDisplayMode = mdc0Var4.b;
                            a4d0 a4d0Var = pcc0Var2.n.g;
                            if (a4d0Var != null) {
                                qor qorVar = a4d0Var.J;
                                boolean z3 = photoVideoDisplayMode == PhotoVideoDisplayMode.Grid;
                                a4d0Var.N.c = !z3;
                                boolean z4 = qorVar.g != z3;
                                qorVar.g = z3;
                                fsk fskVar = qorVar.k;
                                gzs<s3d0> gzsVar = qorVar.f;
                                fskVar.getClass();
                                qorVar.l = !z3 ? new nv9(gzsVar) : new mgu(gzsVar);
                                if (z4) {
                                    qorVar.removeAllViews();
                                    bpr bprVar = qorVar.n;
                                    qorVar.d(bprVar != null ? bprVar.b(qorVar) : EmptyList.b);
                                }
                                qorVar.requestLayout();
                                qorVar.invalidate();
                                bwt0.Q(qorVar, R.id.posting_ui_test_photo_video_display_mode_tag, photoVideoDisplayMode);
                            }
                        }
                        if (pcc0Var2 != null) {
                            boolean l = hg10.l(mdc0Var4);
                            a1u0.b bVar = new a1u0.b(l);
                            pcc0Var2.p = bVar;
                            a4d0 a4d0Var2 = pcc0Var2.n.g;
                            if (a4d0Var2 != null) {
                                pbq pbqVar = a4d0Var2.G;
                                pbqVar.q = bVar;
                                Iterator it = pbqVar.o.iterator();
                                while (it.hasNext()) {
                                    ce6 ce6Var = (ce6) it.next();
                                    if (ce6Var instanceof ykw) {
                                        ykw ykwVar = (ykw) ce6Var;
                                        ykwVar.u = bVar;
                                        zjc0 zjc0Var = ykwVar.t;
                                        zjc0Var.b = bVar;
                                        PreviewAttachmentWrapper previewAttachmentWrapper = zjc0Var.a;
                                        previewAttachmentWrapper.setSpinnerSize(l ? PostingSpinnerSize.Regular : PostingSpinnerSize.Large);
                                        previewAttachmentWrapper.setSpinnerScreen(!zjc0Var.b.a);
                                    } else if (ce6Var instanceof mps0) {
                                        mps0 mps0Var = (mps0) ce6Var;
                                        mps0Var.f = bVar;
                                        zjc0 zjc0Var2 = mps0Var.h;
                                        zjc0Var2.b = bVar;
                                        PreviewAttachmentWrapper previewAttachmentWrapper2 = zjc0Var2.a;
                                        previewAttachmentWrapper2.setSpinnerSize(l ? PostingSpinnerSize.Regular : PostingSpinnerSize.Large);
                                        previewAttachmentWrapper2.setSpinnerScreen(!zjc0Var2.b.a);
                                    }
                                }
                            }
                        }
                        mu9 mu9Var = mediaView2.e;
                        if (hg10.l(mdc0Var4)) {
                            mu9Var.getClass();
                        } else {
                            izs<PostingAction, s3q0> izsVar6 = mu9Var.b;
                            try {
                                cropCarouselType = CropCarouselType.valueOf(cqm0.n(mu9Var.c.invoke()));
                            } catch (IllegalArgumentException unused) {
                                cropCarouselType = CropCarouselType.FIRST;
                            }
                            izsVar6.invoke(new PostingAction$Editing$CropPhoto$SetCurrentRatio(cropCarouselType));
                        }
                        c5d0 mediaView3 = roc0Var.getMediaView();
                        List list7 = list3;
                        wow wowVar = new wow(list7);
                        pcc0 pcc0Var3 = mediaView3.d;
                        ArrayList arrayList = new ArrayList(c5g.u(wowVar, 10));
                        Iterator it2 = list7.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((PostingAttachment) it2.next()).nb());
                        }
                        if (pcc0Var3 == null || (list4 = pcc0Var3.n.f) == null) {
                            list4 = EmptyList.b;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            if (!list4.contains((Attachment) next)) {
                                arrayList2.add(next);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : list4) {
                            Attachment attachment = (Attachment) obj3;
                            if (!arrayList.contains(attachment) && !(attachment instanceof SnippetAttachment) && !(attachment instanceof ArticleAttachment)) {
                                arrayList3.add(obj3);
                            }
                        }
                        if (pcc0Var3 != null) {
                            pcc0Var3.K0(arrayList2);
                        }
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            Attachment attachment2 = (Attachment) it4.next();
                            if (pcc0Var3 != null) {
                                pcc0Var3.N0(attachment2);
                            }
                        }
                        List<T> list8 = wowVar.b;
                        for (T t : list8) {
                            if (t instanceof PhotoDto) {
                                PhotoDto photoDto = (PhotoDto) t;
                                mediaView3.a(photoDto.c, photoDto.f);
                            } else if (t instanceof VideoDto) {
                                VideoDto videoDto = (VideoDto) t;
                                mediaView3.a(videoDto.c, videoDto.f);
                            }
                        }
                        if (mediaView3.g) {
                            Iterator it5 = list8.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it5.next();
                                PostingAttachment postingAttachment2 = (PostingAttachment) obj2;
                                if ((postingAttachment2 instanceof UploadDto) && ((UploadDto) postingAttachment2).I4().d()) {
                                    break;
                                }
                            }
                            postingAttachment = (PostingAttachment) obj2;
                        } else {
                            postingAttachment = null;
                        }
                        mediaView3.n.postDelayed(new ugr(5, mediaView3, postingAttachment), 200L);
                        pcc0 pcc0Var4 = roc0Var.getMediaView().d;
                        if (pcc0Var4 == null || (list5 = pcc0Var4.n.f) == null) {
                            list5 = EmptyList.b;
                        }
                        PostingLinkDto postingLinkDto4 = postingLinkDto3;
                        boolean contains = postingLinkDto4 != null ? list5.contains(postingLinkDto4.b) : false;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : list5) {
                            Attachment attachment3 = (Attachment) obj4;
                            if (attachment3 instanceof SnippetAttachment) {
                                if (!epx.f(attachment3, postingLinkDto4 != null ? postingLinkDto4.b : null)) {
                                    arrayList4.add(obj4);
                                }
                            }
                        }
                        if (!contains && postingLinkDto4 != null && pcc0Var4 != null) {
                            pcc0Var4.K0(Collections.singletonList(postingLinkDto4.b));
                        }
                        Iterator it6 = arrayList4.iterator();
                        while (it6.hasNext()) {
                            Attachment attachment4 = (Attachment) it6.next();
                            if (pcc0Var4 != null) {
                                pcc0Var4.N0(attachment4);
                            }
                        }
                        pcc0 pcc0Var5 = roc0Var.getMediaView().d;
                        if (pcc0Var5 == null || (list6 = pcc0Var5.n.f) == null) {
                            list6 = EmptyList.b;
                        }
                        PostingArticleDto postingArticleDto2 = postingArticleDto;
                        boolean contains2 = postingArticleDto2 != null ? list6.contains(postingArticleDto2.b) : false;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj5 : list6) {
                            Attachment attachment5 = (Attachment) obj5;
                            if (attachment5 instanceof ArticleAttachment) {
                                if (!epx.f(attachment5, postingArticleDto2 != null ? postingArticleDto2.b : null)) {
                                    arrayList5.add(obj5);
                                }
                            }
                        }
                        if (!contains2 && postingArticleDto2 != null && pcc0Var5 != null) {
                            pcc0Var5.K0(Collections.singletonList(postingArticleDto2.b));
                        }
                        Iterator it7 = arrayList5.iterator();
                        while (it7.hasNext()) {
                            Attachment attachment6 = (Attachment) it7.next();
                            if (pcc0Var5 != null) {
                                pcc0Var5.N0(attachment6);
                            }
                        }
                        return s3q0.a;
                    }
                };
                M.R(x4);
            }
            ae2.b(izsVar3, null, izsVar4, izsVar5, (izs) x4, M, 3456, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.q4c0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r4c0.a(list, mdc0Var, photoVideoAttachmentsCropData, i, postingLinkDto, postingArticleDto, izsVar, izsVar2, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}

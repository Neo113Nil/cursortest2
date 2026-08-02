package xsna;

import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.newsfeed.posting.impl.domain.model.CropCarouselType;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$Editing$CropPhoto$RemoveCrops;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$Editing$CropPhoto$SetCurrentRatio;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.mu9;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class rnc0 extends FunctionReferenceImpl implements izs<List<? extends PostingAttachment>, s3q0> {
    /* JADX WARN: Removed duplicated region for block: B:64:0x014a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0106 A[SYNTHETIC] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s3q0 invoke(List<? extends PostingAttachment> list) {
        List list2;
        Iterable<Attachment> iterable;
        CropCarouselType cropCarouselType;
        CropCarouselType cropCarouselType2;
        mu9.a aVar;
        h0c0 h0c0Var = ((enc0) this.receiver).p;
        List<? extends PostingAttachment> list3 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((PostingAttachment) it.next()).nb());
        }
        mu9 mu9Var = h0c0Var.i;
        pcc0 pcc0Var = h0c0Var.g;
        if (pcc0Var == null || (list2 = pcc0Var.n.f) == null) {
            list2 = EmptyList.b;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            Attachment attachment = (Attachment) next;
            if (!list2.contains(attachment)) {
                arrayList2.add(new Pair(Integer.valueOf(i), attachment));
            }
            i = i2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list2) {
            Attachment attachment2 = (Attachment) obj;
            if (!arrayList.contains(attachment2) && !(attachment2 instanceof SnippetAttachment) && !(attachment2 instanceof ArticleAttachment)) {
                arrayList3.add(obj);
            }
        }
        if (pcc0Var != null) {
            val valVar = pcc0Var.n;
            ybc0 ybc0Var = valVar.c;
            ArrayList arrayList4 = valVar.f;
            ArrayList arrayList5 = new ArrayList(arrayList4);
            ArrayList arrayList6 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Pair pair = (Pair) it3.next();
                arrayList5.add(((Number) pair.d()).intValue(), (Attachment) pair.g());
                arrayList6.add(s3q0.a);
            }
            List<x04> c = ybc0Var.c(arrayList4);
            List<x04> c2 = ybc0Var.c(arrayList5);
            valVar.i = c2;
            valVar.a(c2, c);
        }
        int L0 = pcc0Var != null ? pcc0Var.L0() : 0;
        if (pcc0Var == null || (iterable = pcc0Var.n.f) == null) {
            iterable = EmptyList.b;
        }
        gzs<String> gzsVar = mu9Var.c;
        izs<PostingAction, s3q0> izsVar = mu9Var.b;
        ArrayList arrayList7 = new ArrayList();
        for (Attachment attachment3 : iterable) {
            if (!(attachment3 instanceof AlbumAttachment)) {
                if (attachment3 instanceof PhotoAttachment) {
                    aVar = new mu9.a(((PhotoAttachment) attachment3).E0());
                } else if (attachment3 instanceof DocumentAttachment) {
                    Boolean b = mu9Var.a.b((DocumentAttachment) attachment3);
                    if (b != null ? b.booleanValue() : false) {
                        aVar = new mu9.a(fdi.u(attachment3));
                    }
                }
                if (aVar == null) {
                    arrayList7.add(aVar);
                }
            }
            aVar = null;
            if (aVar == null) {
            }
        }
        if (!arrayList7.isEmpty()) {
            try {
                cropCarouselType = CropCarouselType.valueOf(cqm0.n(gzsVar.invoke()));
            } catch (IllegalArgumentException unused) {
                cropCarouselType = CropCarouselType.FIRST;
            }
            izsVar.invoke(new PostingAction$Editing$CropPhoto$SetCurrentRatio(cropCarouselType));
        } else if (L0 > 0) {
            try {
                cropCarouselType2 = CropCarouselType.valueOf(cqm0.n(gzsVar.invoke()));
            } catch (IllegalArgumentException unused2) {
                cropCarouselType2 = CropCarouselType.FIRST;
            }
            izsVar.invoke(new PostingAction$Editing$CropPhoto$SetCurrentRatio(cropCarouselType2));
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Attachment attachment4 = (Attachment) it4.next();
            if (pcc0Var != null) {
                pcc0Var.N0(attachment4);
            }
            if (pcc0Var != null) {
                pcc0Var.L0();
            }
            if (attachment4 instanceof PhotoAttachment) {
                izsVar.invoke(new PostingAction$Editing$CropPhoto$RemoveCrops((PhotoAttachment) attachment4));
            }
        }
        Pair pair2 = (Pair) j5g.a0(arrayList2);
        if (pair2 != null && pcc0Var != null) {
            pcc0Var.O0((Attachment) pair2.j(), true);
        }
        return s3q0.a;
    }
}

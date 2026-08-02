package xsna;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.google.gson.JsonIOException;
import com.vk.common.links.AwayLink;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.pending.PendingVideoAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.SituationalThemeAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: ConstructorConstructor.java */
/* loaded from: classes13.dex */
public final class v6j implements jp70, androidx.media3.exoplayer.mediacodec.e, yc80 {
    public final Object b;

    public /* synthetic */ v6j(Object obj) {
        this.b = obj;
    }

    @Override // xsna.yc80
    public void c(ArrayList arrayList, zx90 zx90Var, gwg gwgVar) {
        f98 f98Var = (f98) this.b;
        if (f98Var != null) {
            f98Var.c(arrayList, zx90Var, gwgVar);
        }
    }

    public void d(Attachment attachment) {
        Object obj;
        Object obj2;
        Object obj3;
        AwayLink awayLink;
        ikc0 ikc0Var = (ikc0) this.b;
        lko0 lko0Var = ikc0Var.z;
        if (lko0Var == null) {
            lko0Var = null;
        }
        lko0Var.Z();
        List<? extends Attachment> singletonList = Collections.singletonList(attachment);
        z84 z84Var = ikc0Var.B;
        if (z84Var == null) {
            z84Var = null;
        }
        b94 b94Var = z84Var.c;
        Iterator it = z84Var.q.iterator();
        while (it.hasNext()) {
            ((c84) it.next()).b(singletonList);
        }
        List<? extends Attachment> list = singletonList;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : list) {
            Attachment attachment2 = (Attachment) obj4;
            boolean z = attachment2 instanceof ArticleAttachment;
            if (z || (attachment2 instanceof SnippetAttachment)) {
                Iterator it2 = ((ArrayList) z84Var.u()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (((Attachment) obj3) instanceof LinkAttachment) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                LinkAttachment linkAttachment = obj3 instanceof LinkAttachment ? (LinkAttachment) obj3 : null;
                if (!epx.f((linkAttachment == null || (awayLink = linkAttachment.f) == null) ? null : awayLink.b, z ? ((ArticleAttachment) attachment2).f.i : attachment2 instanceof SnippetAttachment ? ((SnippetAttachment) attachment2).f.b : null)) {
                    arrayList.add(obj4);
                }
            } else if (attachment2 instanceof LinkAttachment) {
                ArrayList arrayList2 = (ArrayList) z84Var.u();
                if (!arrayList2.isEmpty()) {
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        Attachment attachment3 = (Attachment) it3.next();
                        if ((!(attachment3 instanceof SnippetAttachment) || !epx.f(((LinkAttachment) attachment2).f.b, ((SnippetAttachment) attachment3).f.b)) && ((!(attachment3 instanceof ArticleAttachment) || !epx.f(((LinkAttachment) attachment2).f.b, ((ArticleAttachment) attachment3).f.i)) && (!(attachment3 instanceof LinkAttachment) || !epx.f(((LinkAttachment) attachment2).f.b, ((LinkAttachment) attachment3).f.b)))) {
                        }
                    }
                }
                arrayList.add(obj4);
            } else {
                if (attachment2 instanceof PendingVideoAttachment) {
                    ArrayList arrayList3 = (ArrayList) z84Var.u();
                    if (!arrayList3.isEmpty()) {
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            Attachment attachment4 = (Attachment) it4.next();
                            if (attachment4 instanceof VideoAttachment) {
                                VideoAttachment videoAttachment = (VideoAttachment) attachment4;
                                PendingVideoAttachment pendingVideoAttachment = (PendingVideoAttachment) attachment2;
                                if (videoAttachment.k.o0() != pendingVideoAttachment.getId().intValue()) {
                                    VideoUrlStorage w9 = videoAttachment.k.w9();
                                    VideoUrl videoUrl = VideoUrl.EXTERNAL_URL;
                                    if (epx.f(w9.Ab(videoUrl), pendingVideoAttachment.k.w9().Ab(videoUrl))) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                arrayList.add(obj4);
            }
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            Attachment attachment5 = (Attachment) it5.next();
            if (attachment5 instanceof GeoAttachment) {
                Iterator it6 = ((ArrayList) z84Var.u()).iterator();
                while (true) {
                    if (it6.hasNext()) {
                        obj = it6.next();
                        if (((Attachment) obj) instanceof GeoAttachment) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Attachment attachment6 = (Attachment) obj;
                if (attachment6 != null) {
                    b94Var.m(attachment6);
                }
            } else if (attachment5 instanceof PollAttachment) {
                Iterator it7 = ((ArrayList) z84Var.u()).iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj2 = it7.next();
                        if (((Attachment) obj2) instanceof PollAttachment) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                Attachment attachment7 = (Attachment) obj2;
                if (attachment7 != null) {
                    b94Var.m(attachment7);
                }
            } else if (attachment5 instanceof VideoAttachment) {
                ((VideoAttachment) attachment5).j = false;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj5 : list) {
            Attachment attachment8 = (Attachment) obj5;
            if (attachment8 instanceof SituationalThemeAttachment) {
                z84Var.s.add(attachment8);
            } else {
                arrayList4.add(obj5);
            }
        }
        b94Var.f(arrayList4);
        ikc0Var.Na();
        ikc0Var.Ca();
    }

    public void e(List list) {
        Object obj;
        Object obj2;
        Object obj3;
        AwayLink awayLink;
        ikc0 ikc0Var = (ikc0) this.b;
        lko0 lko0Var = ikc0Var.z;
        if (lko0Var == null) {
            lko0Var = null;
        }
        lko0Var.Z();
        z84 z84Var = ikc0Var.B;
        if (z84Var == null) {
            z84Var = null;
        }
        b94 b94Var = z84Var.c;
        Iterator it = z84Var.q.iterator();
        while (it.hasNext()) {
            ((c84) it.next()).b(list);
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : list2) {
            Attachment attachment = (Attachment) obj4;
            boolean z = attachment instanceof ArticleAttachment;
            if (z || (attachment instanceof SnippetAttachment)) {
                Iterator it2 = ((ArrayList) z84Var.u()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (((Attachment) obj3) instanceof LinkAttachment) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                LinkAttachment linkAttachment = obj3 instanceof LinkAttachment ? (LinkAttachment) obj3 : null;
                if (!epx.f((linkAttachment == null || (awayLink = linkAttachment.f) == null) ? null : awayLink.b, z ? ((ArticleAttachment) attachment).f.i : attachment instanceof SnippetAttachment ? ((SnippetAttachment) attachment).f.b : null)) {
                    arrayList.add(obj4);
                }
            } else if (attachment instanceof LinkAttachment) {
                ArrayList arrayList2 = (ArrayList) z84Var.u();
                if (!arrayList2.isEmpty()) {
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        Attachment attachment2 = (Attachment) it3.next();
                        if ((!(attachment2 instanceof SnippetAttachment) || !epx.f(((LinkAttachment) attachment).f.b, ((SnippetAttachment) attachment2).f.b)) && ((!(attachment2 instanceof ArticleAttachment) || !epx.f(((LinkAttachment) attachment).f.b, ((ArticleAttachment) attachment2).f.i)) && (!(attachment2 instanceof LinkAttachment) || !epx.f(((LinkAttachment) attachment).f.b, ((LinkAttachment) attachment2).f.b)))) {
                        }
                    }
                }
                arrayList.add(obj4);
            } else {
                if (attachment instanceof PendingVideoAttachment) {
                    ArrayList arrayList3 = (ArrayList) z84Var.u();
                    if (!arrayList3.isEmpty()) {
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            Attachment attachment3 = (Attachment) it4.next();
                            if (attachment3 instanceof VideoAttachment) {
                                VideoAttachment videoAttachment = (VideoAttachment) attachment3;
                                PendingVideoAttachment pendingVideoAttachment = (PendingVideoAttachment) attachment;
                                if (videoAttachment.k.o0() != pendingVideoAttachment.getId().intValue()) {
                                    VideoUrlStorage w9 = videoAttachment.k.w9();
                                    VideoUrl videoUrl = VideoUrl.EXTERNAL_URL;
                                    if (epx.f(w9.Ab(videoUrl), pendingVideoAttachment.k.w9().Ab(videoUrl))) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                arrayList.add(obj4);
            }
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            Attachment attachment4 = (Attachment) it5.next();
            if (attachment4 instanceof GeoAttachment) {
                Iterator it6 = ((ArrayList) z84Var.u()).iterator();
                while (true) {
                    if (it6.hasNext()) {
                        obj = it6.next();
                        if (((Attachment) obj) instanceof GeoAttachment) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Attachment attachment5 = (Attachment) obj;
                if (attachment5 != null) {
                    b94Var.m(attachment5);
                }
            } else if (attachment4 instanceof PollAttachment) {
                Iterator it7 = ((ArrayList) z84Var.u()).iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj2 = it7.next();
                        if (((Attachment) obj2) instanceof PollAttachment) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                Attachment attachment6 = (Attachment) obj2;
                if (attachment6 != null) {
                    b94Var.m(attachment6);
                }
            } else if (attachment4 instanceof VideoAttachment) {
                ((VideoAttachment) attachment4).j = false;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj5 : list2) {
            Attachment attachment7 = (Attachment) obj5;
            if (attachment7 instanceof SituationalThemeAttachment) {
                z84Var.s.add(attachment7);
            } else {
                arrayList4.add(obj5);
            }
        }
        b94Var.f(arrayList4);
        ikc0Var.Na();
        ikc0Var.Ca();
    }

    public String f() {
        return (String) this.b;
    }

    @Override // androidx.media3.exoplayer.mediacodec.e
    public List getDecoderInfos(String str, boolean z, boolean z2) {
        List list = (List) ((gzs) this.b).invoke();
        return new ArrayList(j5g.D0(new dm80(list), MediaCodecUtil.e(str, z, z2)));
    }

    @Override // xsna.jp70
    public Object h() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new JsonIOException("Invalid EnumSet type: " + type.toString());
    }
}

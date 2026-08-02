package xsna;

import android.location.Location;
import android.net.Uri;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerAttachTypeDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerCameraTypeDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerEffectDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerFilterPhotoDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerLifetimeDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerMemoryTypeDto;
import com.vk.api.generated.stories.dto.StoriesUploadResultDto;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.dto.stories.entities.stat.StickersStatInfo;
import com.vk.dto.stories.entities.stat.StoryStatContainer;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.QuestionInfo;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.camera.UploadParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NotImplementedError;
import org.json.JSONArray;
import xsna.ij20;

/* compiled from: StoryPhotoGoUploader.kt */
/* loaded from: classes2.dex */
public final class b8m0 extends yjt<AttachStory, ocq0, String, fcm0> {
    public final avl0 k;
    public final g8m0 l;

    public b8m0(w2w w2wVar, AttachStory attachStory) {
        super(w2wVar, attachStory);
        this.k = new avl0();
        this.l = new g8m0();
    }

    @Override // xsna.odq0
    public final boolean c(Attach attach) {
        return (attach instanceof AttachStory) && ((AttachStory) attach).i != null;
    }

    @Override // xsna.yjt
    public final Uri d() {
        throw new NotImplementedError();
    }

    @Override // xsna.yjt
    public final Uri f() {
        return Uri.fromFile(((AttachStory) this.c).i1());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02bd A[EDGE_INSN: B:177:0x02bd->B:172:0x02bd BREAK  A[LOOP:2: B:163:0x029f->B:175:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bb  */
    @Override // xsna.yjt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ocq0 h() {
        StoriesGetPhotoUploadServerAttachTypeDto storiesGetPhotoUploadServerAttachTypeDto;
        String str;
        StoriesGetPhotoUploadServerCameraTypeDto storiesGetPhotoUploadServerCameraTypeDto;
        StoriesGetPhotoUploadServerEffectDto storiesGetPhotoUploadServerEffectDto;
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        StoriesGetPhotoUploadServerFilterPhotoDto storiesGetPhotoUploadServerFilterPhotoDto;
        Integer num;
        Integer num2;
        Iterator<E> it;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l;
        Long l2;
        StoryEntryExtended storyEntryExtended;
        StoryEntry storyEntry;
        String Fb;
        String str7;
        ArrayList arrayList3;
        StoryStatContainer storyStatContainer;
        List<StickersStatInfo> list;
        ClickableStickers clickableStickers;
        String str8;
        StoryStatContainer storyStatContainer2;
        JSONArray Ab;
        StoryUploadParams.CameraType cameraType;
        Location location;
        Location location2;
        AttachStory attachStory = (AttachStory) this.c;
        UploadParams uploadParams = attachStory.g;
        Object obj = null;
        CommonUploadParams commonUploadParams = uploadParams != null ? uploadParams.c : null;
        StorySharingInfo storySharingInfo = commonUploadParams != null ? commonUploadParams.g : null;
        g8m0 g8m0Var = this.l;
        if (storySharingInfo != null) {
            int i = storySharingInfo.b;
            g8m0Var.getClass();
            storiesGetPhotoUploadServerAttachTypeDto = g8m0.d(i);
        } else {
            storiesGetPhotoUploadServerAttachTypeDto = null;
        }
        UploadParams uploadParams2 = attachStory.g;
        StoryUploadParams storyUploadParams = uploadParams2 != null ? uploadParams2.b : null;
        List singletonList = ((commonUploadParams != null && commonUploadParams.Kb()) || storyUploadParams == null || (str = storyUploadParams.C) == null) ? null : Collections.singletonList(str);
        Integer num3 = storyUploadParams != null ? storyUploadParams.D : null;
        StoriesGetPhotoUploadServerLifetimeDto storiesGetPhotoUploadServerLifetimeDto = (num3 != null && num3.intValue() == 1) ? StoriesGetPhotoUploadServerLifetimeDto.TYPE_3600 : (num3 != null && num3.intValue() == 12) ? StoriesGetPhotoUploadServerLifetimeDto.TYPE_43200 : (num3 != null && num3.intValue() == 48) ? StoriesGetPhotoUploadServerLifetimeDto.TYPE_172800 : StoriesGetPhotoUploadServerLifetimeDto.TYPE_86400;
        String str9 = storyUploadParams != null ? storyUploadParams.c : null;
        Integer num4 = storyUploadParams != null ? storyUploadParams.d : null;
        Float valueOf = (storyUploadParams == null || (location2 = storyUploadParams.e) == null) ? null : Float.valueOf((float) location2.getLatitude());
        Float valueOf2 = (storyUploadParams == null || (location = storyUploadParams.e) == null) ? null : Float.valueOf((float) location.getLongitude());
        if (storyUploadParams == null || (cameraType = storyUploadParams.f) == null) {
            storiesGetPhotoUploadServerCameraTypeDto = null;
        } else {
            g8m0Var.getClass();
            storiesGetPhotoUploadServerCameraTypeDto = g8m0.c(cameraType);
        }
        String jSONArray = (storyUploadParams == null || (storyStatContainer2 = storyUploadParams.h) == null || (Ab = storyStatContainer2.Ab()) == null) ? null : Ab.toString();
        Boolean valueOf3 = storyUploadParams != null ? Boolean.valueOf(storyUploadParams.g) : null;
        if (storyUploadParams == null || (str8 = storyUploadParams.i) == null) {
            storiesGetPhotoUploadServerEffectDto = null;
        } else {
            g8m0Var.getClass();
            storiesGetPhotoUploadServerEffectDto = g8m0.a(str8);
        }
        if (storyUploadParams != null && (clickableStickers = storyUploadParams.j) != null) {
            if (clickableStickers.d.isEmpty()) {
                clickableStickers = null;
            }
            if (clickableStickers != null) {
                str2 = clickableStickers.e5().toString();
                if (storyUploadParams != null || (storyStatContainer = storyUploadParams.h) == null || (list = storyStatContainer.c) == null) {
                    arrayList = null;
                } else {
                    List<StickersStatInfo> list2 = list;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(Long.valueOf(((StickersStatInfo) it2.next()).c));
                    }
                    arrayList = arrayList4;
                }
                if (storyUploadParams != null && (arrayList3 = storyUploadParams.v) != null) {
                    if (arrayList3.isEmpty()) {
                        arrayList3 = null;
                    }
                    if (arrayList3 != null) {
                        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList3, 10));
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(((QuestionInfo) it3.next()).zb());
                        }
                        arrayList2 = arrayList5;
                        Boolean bool = storyUploadParams != null ? storyUploadParams.n : null;
                        String str10 = storyUploadParams != null ? storyUploadParams.s : null;
                        if (storyUploadParams != null || (str7 = storyUploadParams.q) == null) {
                            storiesGetPhotoUploadServerFilterPhotoDto = null;
                        } else {
                            g8m0Var.getClass();
                            storiesGetPhotoUploadServerFilterPhotoDto = g8m0.b(str7);
                        }
                        Integer num5 = storyUploadParams != null ? storyUploadParams.x : null;
                        Integer num6 = storyUploadParams != null ? storyUploadParams.y : null;
                        UserId userId = commonUploadParams != null ? commonUploadParams.e : null;
                        String str11 = (commonUploadParams != null || (storyEntryExtended = commonUploadParams.f) == null || (storyEntry = storyEntryExtended.b) == null || (Fb = storyEntry.Fb()) == null || !commonUploadParams.Mb()) ? null : Fb;
                        Boolean valueOf4 = commonUploadParams != null ? Boolean.valueOf(commonUploadParams.c) : null;
                        String str12 = storySharingInfo != null ? storySharingInfo.h : null;
                        if (storySharingInfo != null && (l2 = storySharingInfo.c) != null) {
                            if (storiesGetPhotoUploadServerAttachTypeDto == null) {
                                l2 = null;
                            }
                            if (l2 != null) {
                                num = Integer.valueOf((int) l2.longValue());
                                if (storySharingInfo != null && (l = storySharingInfo.d) != null) {
                                    if (storiesGetPhotoUploadServerAttachTypeDto == null) {
                                        l = null;
                                    }
                                    if (l != null) {
                                        num2 = Integer.valueOf((int) l.longValue());
                                        String str13 = (storySharingInfo != null || (str6 = storySharingInfo.e) == null || storiesGetPhotoUploadServerAttachTypeDto == null || str6.length() <= 0) ? null : str6;
                                        String str14 = (storySharingInfo != null || (str5 = storySharingInfo.f) == null || storiesGetPhotoUploadServerAttachTypeDto != null || str5.length() <= 0) ? null : str5;
                                        String str15 = (commonUploadParams != null || (str4 = commonUploadParams.h) == null || str4.length() <= 0) ? null : str4;
                                        String str16 = (commonUploadParams == null && (str3 = commonUploadParams.j) != null && str3.length() == 0) ? str3 : null;
                                        Integer num7 = commonUploadParams != null ? commonUploadParams.l : null;
                                        Boolean valueOf5 = commonUploadParams != null ? Boolean.valueOf(commonUploadParams.m) : null;
                                        List<Integer> list3 = commonUploadParams != null ? commonUploadParams.p : null;
                                        String e = sxc0.a().e(commonUploadParams, storyUploadParams);
                                        String str17 = storyUploadParams != null ? storyUploadParams.L : null;
                                        it = StoriesGetPhotoUploadServerMemoryTypeDto.i().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Object next = it.next();
                                            if (epx.f(((StoriesGetPhotoUploadServerMemoryTypeDto) next).j(), storyUploadParams != null ? storyUploadParams.K : null)) {
                                                obj = next;
                                                break;
                                            }
                                        }
                                        ij20.a o = bz2.o(zul0.f(this.k, valueOf4, null, str11, arrayList2, str12, str14, str9, (StoriesGetPhotoUploadServerMemoryTypeDto) obj, str17, userId, num4, storiesGetPhotoUploadServerCameraTypeDto, storiesGetPhotoUploadServerEffectDto, storiesGetPhotoUploadServerFilterPhotoDto, jSONArray, valueOf, valueOf2, storiesGetPhotoUploadServerAttachTypeDto, num, num2, str13, valueOf3, str2, arrayList, str16, str15, e, bool, valueOf5, num7, num5, num6, str10, list3, singletonList, null, null, null, storiesGetPhotoUploadServerLifetimeDto, null, null, 452368), bz2.m());
                                        o.i = true;
                                        return (ocq0) bz2.f(new ij20(o), a8m0.b);
                                    }
                                }
                                num2 = null;
                                if (storySharingInfo != null) {
                                }
                                if (storySharingInfo != null) {
                                }
                                if (commonUploadParams != null) {
                                }
                                if (commonUploadParams == null) {
                                }
                                if (commonUploadParams != null) {
                                }
                                if (commonUploadParams != null) {
                                }
                                if (commonUploadParams != null) {
                                }
                                String e2 = sxc0.a().e(commonUploadParams, storyUploadParams);
                                if (storyUploadParams != null) {
                                }
                                it = StoriesGetPhotoUploadServerMemoryTypeDto.i().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                    }
                                }
                                ij20.a o2 = bz2.o(zul0.f(this.k, valueOf4, null, str11, arrayList2, str12, str14, str9, (StoriesGetPhotoUploadServerMemoryTypeDto) obj, str17, userId, num4, storiesGetPhotoUploadServerCameraTypeDto, storiesGetPhotoUploadServerEffectDto, storiesGetPhotoUploadServerFilterPhotoDto, jSONArray, valueOf, valueOf2, storiesGetPhotoUploadServerAttachTypeDto, num, num2, str13, valueOf3, str2, arrayList, str16, str15, e2, bool, valueOf5, num7, num5, num6, str10, list3, singletonList, null, null, null, storiesGetPhotoUploadServerLifetimeDto, null, null, 452368), bz2.m());
                                o2.i = true;
                                return (ocq0) bz2.f(new ij20(o2), a8m0.b);
                            }
                        }
                        num = null;
                        if (storySharingInfo != null) {
                            if (storiesGetPhotoUploadServerAttachTypeDto == null) {
                            }
                            if (l != null) {
                            }
                        }
                        num2 = null;
                        if (storySharingInfo != null) {
                        }
                        if (storySharingInfo != null) {
                        }
                        if (commonUploadParams != null) {
                        }
                        if (commonUploadParams == null) {
                        }
                        if (commonUploadParams != null) {
                        }
                        if (commonUploadParams != null) {
                        }
                        if (commonUploadParams != null) {
                        }
                        String e22 = sxc0.a().e(commonUploadParams, storyUploadParams);
                        if (storyUploadParams != null) {
                        }
                        it = StoriesGetPhotoUploadServerMemoryTypeDto.i().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                            }
                        }
                        ij20.a o22 = bz2.o(zul0.f(this.k, valueOf4, null, str11, arrayList2, str12, str14, str9, (StoriesGetPhotoUploadServerMemoryTypeDto) obj, str17, userId, num4, storiesGetPhotoUploadServerCameraTypeDto, storiesGetPhotoUploadServerEffectDto, storiesGetPhotoUploadServerFilterPhotoDto, jSONArray, valueOf, valueOf2, storiesGetPhotoUploadServerAttachTypeDto, num, num2, str13, valueOf3, str2, arrayList, str16, str15, e22, bool, valueOf5, num7, num5, num6, str10, list3, singletonList, null, null, null, storiesGetPhotoUploadServerLifetimeDto, null, null, 452368), bz2.m());
                        o22.i = true;
                        return (ocq0) bz2.f(new ij20(o22), a8m0.b);
                    }
                }
                arrayList2 = null;
                if (storyUploadParams != null) {
                }
                if (storyUploadParams != null) {
                }
                if (storyUploadParams != null) {
                }
                storiesGetPhotoUploadServerFilterPhotoDto = null;
                if (storyUploadParams != null) {
                }
                if (storyUploadParams != null) {
                }
                if (commonUploadParams != null) {
                }
                if (commonUploadParams != null) {
                }
                if (commonUploadParams != null) {
                }
                if (storySharingInfo != null) {
                }
                if (storySharingInfo != null) {
                    if (storiesGetPhotoUploadServerAttachTypeDto == null) {
                    }
                    if (l2 != null) {
                    }
                }
                num = null;
                if (storySharingInfo != null) {
                }
                num2 = null;
                if (storySharingInfo != null) {
                }
                if (storySharingInfo != null) {
                }
                if (commonUploadParams != null) {
                }
                if (commonUploadParams == null) {
                }
                if (commonUploadParams != null) {
                }
                if (commonUploadParams != null) {
                }
                if (commonUploadParams != null) {
                }
                String e222 = sxc0.a().e(commonUploadParams, storyUploadParams);
                if (storyUploadParams != null) {
                }
                it = StoriesGetPhotoUploadServerMemoryTypeDto.i().iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                ij20.a o222 = bz2.o(zul0.f(this.k, valueOf4, null, str11, arrayList2, str12, str14, str9, (StoriesGetPhotoUploadServerMemoryTypeDto) obj, str17, userId, num4, storiesGetPhotoUploadServerCameraTypeDto, storiesGetPhotoUploadServerEffectDto, storiesGetPhotoUploadServerFilterPhotoDto, jSONArray, valueOf, valueOf2, storiesGetPhotoUploadServerAttachTypeDto, num, num2, str13, valueOf3, str2, arrayList, str16, str15, e222, bool, valueOf5, num7, num5, num6, str10, list3, singletonList, null, null, null, storiesGetPhotoUploadServerLifetimeDto, null, null, 452368), bz2.m());
                o222.i = true;
                return (ocq0) bz2.f(new ij20(o222), a8m0.b);
            }
        }
        str2 = null;
        if (storyUploadParams != null) {
        }
        arrayList = null;
        if (storyUploadParams != null) {
            if (arrayList3.isEmpty()) {
            }
            if (arrayList3 != null) {
            }
        }
        arrayList2 = null;
        if (storyUploadParams != null) {
        }
        if (storyUploadParams != null) {
        }
        if (storyUploadParams != null) {
        }
        storiesGetPhotoUploadServerFilterPhotoDto = null;
        if (storyUploadParams != null) {
        }
        if (storyUploadParams != null) {
        }
        if (commonUploadParams != null) {
        }
        if (commonUploadParams != null) {
        }
        if (commonUploadParams != null) {
        }
        if (storySharingInfo != null) {
        }
        if (storySharingInfo != null) {
        }
        num = null;
        if (storySharingInfo != null) {
        }
        num2 = null;
        if (storySharingInfo != null) {
        }
        if (storySharingInfo != null) {
        }
        if (commonUploadParams != null) {
        }
        if (commonUploadParams == null) {
        }
        if (commonUploadParams != null) {
        }
        if (commonUploadParams != null) {
        }
        if (commonUploadParams != null) {
        }
        String e2222 = sxc0.a().e(commonUploadParams, storyUploadParams);
        if (storyUploadParams != null) {
        }
        it = StoriesGetPhotoUploadServerMemoryTypeDto.i().iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        ij20.a o2222 = bz2.o(zul0.f(this.k, valueOf4, null, str11, arrayList2, str12, str14, str9, (StoriesGetPhotoUploadServerMemoryTypeDto) obj, str17, userId, num4, storiesGetPhotoUploadServerCameraTypeDto, storiesGetPhotoUploadServerEffectDto, storiesGetPhotoUploadServerFilterPhotoDto, jSONArray, valueOf, valueOf2, storiesGetPhotoUploadServerAttachTypeDto, num, num2, str13, valueOf3, str2, arrayList, str16, str15, e2222, bool, valueOf5, num7, num5, num6, str10, list3, singletonList, null, null, null, storiesGetPhotoUploadServerLifetimeDto, null, null, 452368), bz2.m());
        o2222.i = true;
        return (ocq0) bz2.f(new ij20(o2222), a8m0.b);
    }

    @Override // xsna.yjt
    public final fcm0 j(String str) {
        ij20.a o = bz2.o(zul0.c(this.k, Collections.singletonList(new StoriesUploadResultDto(str)), null, 13), bz2.m());
        o.i = true;
        return (fcm0) bz2.f(new ij20(o), gcm0.b);
    }

    @Override // xsna.yjt
    public final boolean l() {
        return false;
    }

    @Override // xsna.yjt
    public final Attach n(fcm0 fcm0Var) {
        fcm0 fcm0Var2 = fcm0Var;
        T t = this.c;
        StoryEntry storyEntry = ((AttachStory) t).b;
        storyEntry.c = fcm0Var2.a;
        storyEntry.d = fcm0Var2.b;
        storyEntry.o = fcm0Var2.c;
        return t;
    }

    @Override // xsna.yjt
    public final Object o(Uri uri, Object obj) {
        Object e;
        ocq0 ocq0Var = (ocq0) obj;
        wqb wqbVar = new wqb(22, this, uri);
        z7m0 z7m0Var = z7m0.b;
        String str = ocq0Var.a;
        try {
            e = bz2.e((akv) wqbVar.invoke(str), this, z7m0Var);
        } catch (Exception e2) {
            String str2 = ocq0Var.b;
            if (str2 == null || str2.equals(str)) {
                throw e2;
            }
            e = bz2.e((akv) wqbVar.invoke(str2), this, z7m0Var);
        }
        return (String) e;
    }
}

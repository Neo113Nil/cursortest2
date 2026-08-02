package xsna;

import com.vk.api.generated.likes.dto.LikesTypeDto;
import com.vk.dto.photo.Photo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: GetFeedLikes.kt */
/* loaded from: classes4.dex */
public final class jrt extends com.vk.api.request.rx.batch.a<a, List<? extends Photo>, krt> {

    /* compiled from: GetFeedLikes.kt */
    public static final class a {
        public final ArrayList a;
        public final String b;

        public a(String str, ArrayList arrayList) {
            this.a = arrayList;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NewsfeedLikesFeedResponse(entries=");
            sb.append(this.a);
            sb.append(", nextFrom=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jrt(String str, String str2, String str3) {
        super(r7, r0);
        ?? l;
        Object obj;
        dz60 dz60Var = new dz60();
        List c0 = drm0.c0(str3, new String[]{StringUtils.COMMA}, 0, 6);
        if (str2 == null || str2.length() == 0) {
            l = e43.l(LikesTypeDto.POST, LikesTypeDto.COMMENT, LikesTypeDto.CLIP, LikesTypeDto.VIDEO);
        } else {
            List<String> c02 = drm0.c0(str2, new String[]{StringUtils.COMMA}, 0, 6);
            l = new ArrayList();
            for (String str4 : c02) {
                Iterator it = LikesTypeDto.i().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (epx.f(((LikesTypeDto) obj).j(), str4)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                LikesTypeDto likesTypeDto = (LikesTypeDto) obj;
                if (likesTypeDto != null) {
                    l.add(likesTypeDto);
                }
            }
        }
        hz2 z = yfb.z(cz60.g(dz60Var, str, c0, l, 35), new irt(0));
        z.C(1, "photo_sizes");
        tfx tfxVar = new tfx("fave.getPhotos", new kr(20), new lr(15));
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, 0, 0, 0, 8);
        tfx.l(tfxVar, "count", 30, 0, 0, 8);
        hz2 z2 = yfb.z(tfxVar, new wh1(20));
        z2.C(1, "photo_sizes");
    }

    @Override // com.vk.api.request.rx.batch.a
    public final krt K0(bv6<a> bv6Var, bv6<List<? extends Photo>> bv6Var2) {
        a aVar = bv6Var.a;
        return new krt(aVar.b, aVar.a, bv6Var2.a);
    }
}

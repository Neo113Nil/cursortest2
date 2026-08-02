package xsna;

import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.newsfeed.entries.ProfilesRecommendations;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.builders.ListBuilder;
import xsna.bwy;
import xsna.z0e0;

/* compiled from: ProfilesCarouselTransformer.kt */
/* loaded from: classes4.dex */
public final class a1e0 {

    /* compiled from: ProfilesCarouselTransformer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProfilesRecommendations.InfoCard.Template.values().length];
            try {
                iArr[ProfilesRecommendations.InfoCard.Template.IMPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfilesRecommendations.InfoCard.Template.IMPORT_PHOTOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static AbstractList a(ProfilesRecommendations profilesRecommendations, boolean z, boolean z2) {
        Object bVar;
        ArrayList<RecommendedProfile> arrayList = profilesRecommendations.l;
        ProfilesRecommendations.InfoCard infoCard = profilesRecommendations.n;
        ProfilesRecommendations.InfoCard.Template template = infoCard != null ? infoCard.b : null;
        int i = template == null ? -1 : a.$EnumSwitchMapping$0[template.ordinal()];
        if ((i == 1 || i == 2) && z2) {
            infoCard = null;
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new z0e0.d((RecommendedProfile) it.next()));
        }
        bwy bwyVar = profilesRecommendations.f;
        if (epx.f(bwyVar, bwy.c.a) || epx.f(bwyVar, bwy.a.a) || arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(20);
            for (int i2 = 0; i2 < 20; i2++) {
                arrayList3.add(z0e0.f.a);
            }
            return arrayList3;
        }
        ListBuilder e = e43.e();
        e.addAll(arrayList2);
        if (infoCard != null) {
            ProfilesRecommendations.InfoCard.Template template2 = infoCard.b;
            int i3 = template2 != null ? a.$EnumSwitchMapping$0[template2.ordinal()] : -1;
            if (i3 == 1) {
                bVar = new z0e0.b(z2);
            } else if (i3 != 2) {
                bVar = new z0e0.c(infoCard);
            } else {
                String str = infoCard.d;
                if (str == null) {
                    str = "";
                }
                String str2 = infoCard.e;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = infoCard.g;
                bVar = new z0e0.a(str, str2, str3 != null ? str3 : "");
            }
            int size = e.size();
            int i4 = infoCard.c;
            if (i4 >= 0 && i4 < size) {
                e.add(i4, bVar);
            } else if (i4 >= e.size()) {
                e.add(bVar);
            }
        }
        if (!z) {
            e.add(z0e0.e.a);
        }
        return e.g();
    }
}

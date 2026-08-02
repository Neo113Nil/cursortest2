package xsna;

import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: StoryPrivacySettingsController.kt */
/* loaded from: classes6.dex */
public final class dam0 {
    public static final LinkedHashSet<String> d = izi0.e("stories_exclude", "stories_replies", "stories_questions");
    public final Object a;
    public final Object b;
    public final j2r0 c;

    /* compiled from: StoryPrivacySettingsController.kt */
    public static final class a {
        public static PrivacyRules.Exclude a(PrivacySetting privacySetting) {
            List<PrivacySetting.PrivacyRule> list = privacySetting.e;
            if (!epx.f(privacySetting.b, "stories_exclude")) {
                list = null;
            }
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof PrivacyRules.Exclude) {
                    arrayList.add(obj);
                }
            }
            return (PrivacyRules.Exclude) j5g.a0(arrayList);
        }
    }

    static {
        izi0.e("stories", "stories_replies", "stories_questions");
    }

    public dam0() {
        xs6 xs6Var = new xs6(29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = msy.a(lazyThreadSafetyMode, xs6Var);
        this.b = msy.a(lazyThreadSafetyMode, new d14(29));
        this.c = new j2r0();
    }
}

package xsna;

import android.app.Activity;
import android.view.View;
import com.vk.api.base.VkPaginationList;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.core.preference.Preference;
import com.vk.dto.group.Group;
import com.vk.dto.stories.model.StoryPrivacyResponse;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class j9m0 implements izs {
    public final /* synthetic */ l9m0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Ref$BooleanRef d;
    public final /* synthetic */ Ref$BooleanRef e;
    public final /* synthetic */ kam0 f;
    public final /* synthetic */ izs g;
    public final /* synthetic */ Ref$ObjectRef h;

    public /* synthetic */ j9m0(l9m0 l9m0Var, boolean z, Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, kam0 kam0Var, izs izsVar, Ref$ObjectRef ref$ObjectRef) {
        this.b = l9m0Var;
        this.c = z;
        this.d = ref$BooleanRef;
        this.e = ref$BooleanRef2;
        this.f = kam0Var;
        this.g = izsVar;
        this.h = ref$ObjectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0083  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        StoryPrivacyType a;
        StoryPrivacyType storyPrivacyType;
        boolean z;
        View view;
        Activity b;
        String obj2;
        String s;
        Object d = ((Pair) obj).d();
        boolean z2 = d instanceof StoryPrivacyResponse;
        l9m0 l9m0Var = this.b;
        Ref$BooleanRef ref$BooleanRef = this.d;
        Ref$BooleanRef ref$BooleanRef2 = this.e;
        if (z2) {
            StoryPrivacyResponse storyPrivacyResponse = (StoryPrivacyResponse) d;
            xqj0 xqj0Var = l9m0Var.c;
            gpj0 gpj0Var = l9m0Var.b;
            StoryPrivacyType a2 = ham0.a(gpj0Var, storyPrivacyResponse.d());
            kam0 kam0Var = l9m0Var.d;
            if (kam0Var != null && (view = kam0Var.a) != null && (b = enj.b(view)) != null && (obj2 = b.toString()) != null) {
                s = Preference.s("STORY_PRIVACY", "TEMP_PRIVACY_KEY", new String());
                if (obj2.equals(s)) {
                    str = Preference.s("STORY_PRIVACY", "TEMP_PRIVACY_VALUE", l9m0Var.e.j());
                    if ((str.equals(StoryPrivacyType.ALL.j()) || str.equals(StoryPrivacyType.FRIENDS_OF_FRIENDS.j())) && gpj0Var.d()) {
                        str = StoryPrivacyType.FRIENDS.j();
                    }
                    if (str == null) {
                        str = l9m0Var.i();
                    }
                    a = str.length() != 0 ? a2 : ham0.a(gpj0Var, str);
                    storyPrivacyType = StoryPrivacyType.ONLY_ME;
                    if (a == storyPrivacyType) {
                        a = gpj0Var.d() ? StoryPrivacyType.FRIENDS : StoryPrivacyType.ALL;
                        l9m0Var.i = xqj0Var.k();
                        if (l9m0Var.j == null) {
                            l9m0Var.j = Boolean.valueOf(xqj0Var.k());
                        }
                    }
                    StoryPrivacyType storyPrivacyType2 = a;
                    if (a2 != storyPrivacyType) {
                        Boolean bool = l9m0Var.j;
                        if (bool != null) {
                            z = bool.booleanValue();
                            if (!z) {
                                a2 = null;
                            }
                            l9m0Var.h(storyPrivacyType2, a2, storyPrivacyResponse.a(), storyPrivacyResponse.b(), storyPrivacyResponse.c(), this.c, storyPrivacyResponse.d() != null);
                            ref$BooleanRef.element = true;
                        }
                        z = false;
                        if (!z) {
                        }
                        l9m0Var.h(storyPrivacyType2, a2, storyPrivacyResponse.a(), storyPrivacyResponse.b(), storyPrivacyResponse.c(), this.c, storyPrivacyResponse.d() != null);
                        ref$BooleanRef.element = true;
                    } else {
                        if (ham0.a.contains(a2)) {
                            z = true;
                            if (!z) {
                            }
                            l9m0Var.h(storyPrivacyType2, a2, storyPrivacyResponse.a(), storyPrivacyResponse.b(), storyPrivacyResponse.c(), this.c, storyPrivacyResponse.d() != null);
                            ref$BooleanRef.element = true;
                        }
                        z = false;
                        if (!z) {
                        }
                        l9m0Var.h(storyPrivacyType2, a2, storyPrivacyResponse.a(), storyPrivacyResponse.b(), storyPrivacyResponse.c(), this.c, storyPrivacyResponse.d() != null);
                        ref$BooleanRef.element = true;
                    }
                }
            }
            str = null;
            if (str == null) {
            }
            if (str.length() != 0) {
            }
            storyPrivacyType = StoryPrivacyType.ONLY_ME;
            if (a == storyPrivacyType) {
            }
            StoryPrivacyType storyPrivacyType22 = a;
            if (a2 != storyPrivacyType) {
            }
        } else if (d instanceof VkPaginationList) {
            VkPaginationList vkPaginationList = (VkPaginationList) d;
            Iterable iterable = vkPaginationList.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : iterable) {
                if (obj3 instanceof Group) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Group group = (Group) it.next();
                group.c = fkq0.e(group.c);
                arrayList2.add(group);
            }
            l9m0Var.f = new VkPaginationList<>(arrayList2, vkPaginationList.c, vkPaginationList.d, Math.min(10, arrayList2.size()));
            ref$BooleanRef2.element = true;
        }
        if (ref$BooleanRef.element && ref$BooleanRef2.element) {
            this.f.b.invoke(Boolean.FALSE);
            this.g.invoke(Boolean.valueOf(!l9m0Var.f.b.isEmpty()));
        }
        gzs gzsVar = (gzs) this.h.element;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        return s3q0.a;
    }
}

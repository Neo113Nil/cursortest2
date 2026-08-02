package xsna;

import android.app.Activity;
import com.vk.camera.editor.stories.impl.background.BackgroundEditorState;
import com.vk.core.fragments.FragmentEntry;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import com.vk.dto.stories.model.StoryBackground;
import com.vk.navigation.NavigationDelegateActivity;
import com.vk.toggle.anonymous.SakFeatures;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ext;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class hyl0 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hyl0(com.vk.camera.editor.stories.impl.background.b bVar, boolean z, com.vk.lists.c cVar) {
        this.d = bVar;
        this.c = z;
        this.e = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r4 == null) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v15, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v9, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, xsna.m6r0] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v38, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v27, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ?? r10;
        ?? r6;
        ?? r102;
        ?? r3;
        ww50 v;
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                com.vk.camera.editor.stories.impl.background.b bVar = (com.vk.camera.editor.stories.impl.background.b) obj3;
                com.vk.lists.c cVar = (com.vk.lists.c) obj2;
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = bVar.j;
                Map<StoryBackgroundType, List<qyl0>> map2 = bVar.h.a;
                StoryBackgroundType storyBackgroundType = StoryBackgroundType.BLUR;
                List<qyl0> list = map2.get(storyBackgroundType);
                qyl0 qyl0Var = list != null ? (qyl0) j5g.a0(list) : null;
                if (z) {
                    bVar.h.a.clear();
                    bVar.f.clear();
                }
                cVar.r(false);
                linkedHashMap.put(storyBackgroundType, e43.m(qyl0Var));
                StoryBackgroundType storyBackgroundType2 = StoryBackgroundType.COLOR;
                List list2 = (List) map.get(storyBackgroundType2);
                if (list2 != null) {
                    List list3 = list2;
                    r10 = new ArrayList(c5g.u(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        r10.add(new qyl0((StoryBackground) it.next(), true));
                    }
                } else {
                    r10 = 0;
                }
                if (r10 == 0) {
                    r10 = EmptyList.b;
                }
                linkedHashMap.put(storyBackgroundType2, r10);
                List list4 = (List) map.get(StoryBackgroundType.ANIMATED);
                if (list4 != null) {
                    List list5 = list4;
                    r6 = new ArrayList(c5g.u(list5, 10));
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        r6.add(new qyl0((StoryBackground) it2.next(), false));
                    }
                } else {
                    r6 = 0;
                }
                if (r6 == 0) {
                    r6 = EmptyList.b;
                }
                List list6 = (List) map.get(StoryBackgroundType.GRAPHICS);
                if (list6 != null) {
                    List list7 = list6;
                    r102 = new ArrayList(c5g.u(list7, 10));
                    Iterator it3 = list7.iterator();
                    while (it3.hasNext()) {
                        r102.add(new qyl0((StoryBackground) it3.next(), true));
                    }
                } else {
                    r102 = 0;
                }
                if (r102 == 0) {
                    r102 = EmptyList.b;
                }
                Collection collection = (List) bVar.k.get(StoryBackgroundType.GRAPHICS);
                if (collection == null) {
                    collection = EmptyList.b;
                }
                ArrayList u0 = j5g.u0((Iterable) r102, collection);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                Iterator it4 = u0.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    if (hashSet.add(((qyl0) next).a.c)) {
                        arrayList.add(next);
                    }
                }
                linkedHashMap.put(StoryBackgroundType.GRAPHICS, j5g.u0(arrayList, (Collection) r6));
                u76 u76Var = bVar.c;
                StoryBackgroundType z2 = u76Var != null ? u76Var.z() : null;
                StoryBackgroundType storyBackgroundType3 = StoryBackgroundType.MARUSIA;
                if (z2 == storyBackgroundType3) {
                    List list8 = (List) map.get(storyBackgroundType3);
                    if (list8 != null) {
                        List list9 = list8;
                        r3 = new ArrayList(c5g.u(list9, 10));
                        Iterator it5 = list9.iterator();
                        while (it5.hasNext()) {
                            r3.add(new qyl0((StoryBackground) it5.next(), true));
                        }
                    } else {
                        r3 = 0;
                    }
                    if (r3 == 0) {
                        r3 = EmptyList.b;
                    }
                    StoryBackgroundType storyBackgroundType4 = StoryBackgroundType.GRAPHICS;
                    Collection collection2 = (List) linkedHashMap.get(storyBackgroundType4);
                    if (collection2 == null) {
                        collection2 = EmptyList.b;
                    }
                    linkedHashMap.put(storyBackgroundType4, j5g.u0((Iterable) r3, collection2));
                }
                bVar.h = BackgroundEditorState.a(bVar.h, linkedHashMap, null, null, null, null, null, false, false, null, null, null, null, null, null, 32766);
                io.reactivex.rxjava3.disposables.c cVar2 = bVar.n;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                bVar.n = ((gql0) bVar.e.getValue()).b.b().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new k130(new r6i0(bVar, 6), 22), new cc20(new c3v(26), 24));
                fw5 fw5Var = bVar.q;
                if (fw5Var != null) {
                    if (!bVar.b(fw5Var)) {
                        bVar.d0();
                    }
                    bVar.q = null;
                } else {
                    bVar.f0(null);
                }
                u76 u76Var2 = bVar.c;
                if ((u76Var2 != null ? u76Var2.z() : null) != null) {
                    bVar.e0();
                } else {
                    u76 u76Var3 = bVar.c;
                    if ((u76Var3 != null && u76Var3.u0()) || bVar.p) {
                        bVar.d0();
                        bVar.p = false;
                    }
                }
                break;
            default:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj3;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj2;
                ext.b bVar2 = (ext.b) obj;
                if (SakFeatures.Type.GET_USER_INFO_CUT_OFF_FROM_AUTH.h()) {
                    FragmentEntry fragmentEntry = (FragmentEntry) ref$ObjectRef.element;
                    if (z) {
                    }
                }
                ref$ObjectRef2.element = bVar2.a;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b == null || (v = s200.v(b)) == null) {
                    NavigationDelegateActivity a = x93.a();
                    if (a != null) {
                        r2 = a.Y();
                    }
                } else {
                    r2 = v;
                }
                if (r2 != null) {
                    i0q0.f(new h8n0(r2, 3));
                    s3q0 s3q0Var = s3q0.a;
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ hyl0(boolean z, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
        this.c = z;
        this.d = ref$ObjectRef;
        this.e = ref$ObjectRef2;
    }
}

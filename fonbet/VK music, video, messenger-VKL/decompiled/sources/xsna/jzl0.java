package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.vk.api.generated.groups.dto.GroupsGroupAdminLevelDto;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.stories.entities.StoryUserProfile;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.ads.MyTargetAdStoriesContainer;
import com.vk.dto.stories.model.clickable.ClickableApp;
import com.vk.dto.stories.model.clickable.ClickableClip;
import com.vk.dto.stories.model.clickable.ClickableMention;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.dto.stories.model.clickable.ClickableVideo;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.story.viewer.stat.domain.LoadStrategy;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import xsna.rwl0;
import xsna.uwl0;

/* compiled from: StoryBottomController.kt */
/* loaded from: classes6.dex */
public final class jzl0 implements rwl0.a {
    public final ezl0 A;
    public final gzl0 B;
    public jd80 C;
    public int D;

    @SuppressLint({"UseSparseArrays"})
    public final SparseArray<Boolean> E;
    public final StoryBottomViewGroup a;
    public final twl0 b;
    public io.reactivex.rxjava3.disposables.c c;
    public io.reactivex.rxjava3.disposables.c d;
    public io.reactivex.rxjava3.disposables.c e;
    public io.reactivex.rxjava3.disposables.c f;
    public final boolean g;
    public StoryEntry h;
    public StoriesContainer i;
    public nzl0 j;
    public vwl0 k;
    public zim0 l;
    public ebm0 m;
    public l5m0 n;
    public VKList<StoryUserProfile> o;
    public int p;
    public final LinkedHashSet q;
    public Object r;
    public boolean s;
    public int t;
    public final com.vk.story.viewer.impl.presentation.stories.view.storyview.b u;
    public final Handler v;
    public Runnable w;
    public Triple<? extends StoryEntry, Long, ? extends LoadStrategy> x;
    public boolean y;
    public p870 z;

    /* JADX WARN: Type inference failed for: r2v3, types: [xsna.ezl0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [xsna.gzl0] */
    public jzl0(StoryBottomViewGroup storyBottomViewGroup, twl0 twl0Var) {
        this.a = storyBottomViewGroup;
        this.b = twl0Var;
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.d = emptyDisposable;
        this.e = emptyDisposable;
        this.f = emptyDisposable;
        eqy<bek0> eqyVar = com.vk.toggle.d.a;
        this.g = true;
        this.o = new VKList<>();
        this.q = new LinkedHashSet();
        this.r = EmptyList.b;
        this.t = -1;
        this.u = new com.vk.story.viewer.impl.presentation.stories.view.storyview.b(storyBottomViewGroup);
        this.v = new Handler(Looper.getMainLooper());
        this.w = new oe9();
        this.A = new bd70() { // from class: xsna.ezl0
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                StoryEntry storyEntry = (StoryEntry) obj;
                jzl0 jzl0Var = jzl0.this;
                StoryEntry storyEntry2 = jzl0Var.h;
                if (storyEntry2 != null && storyEntry.c == storyEntry2.c && jzl0Var.y) {
                    jzl0Var.m(storyEntry2, false);
                    jzl0Var.y = false;
                }
            }
        };
        this.B = new bd70() { // from class: xsna.gzl0
            @Override // xsna.bd70
            public final void x0(int i, int i2, Object obj) {
                Pair pair = (Pair) obj;
                jzl0 jzl0Var = jzl0.this;
                StoryEntry storyEntry = jzl0Var.h;
                if (storyEntry == null || ((StoryEntry) pair.i()).c != storyEntry.c) {
                    return;
                }
                Throwable th = (Throwable) pair.j();
                StoryBottomViewGroup storyBottomViewGroup2 = jzl0Var.a;
                StoryEntry storyEntry2 = jzl0Var.h;
                if (storyEntry2 == null) {
                    return;
                }
                L.i(th);
                if (jzl0Var.g) {
                    storyBottomViewGroup2.V4(storyEntry2.c0);
                } else {
                    jzl0Var.m(storyEntry2, false);
                }
                Context context = storyBottomViewGroup2.getContext();
                cmf0.d(context, s200.y(storyBottomViewGroup2.getContext()), context.getString(R.string.error), false, iah0.a(88), true);
            }
        };
        this.E = new SparseArray<>();
        new bpn0(new wrl0(this, 1));
    }

    public static float h(boolean z) {
        return z ? 0.3f : 1.0f;
    }

    public static void j(jzl0 jzl0Var) {
        StoryEntry storyEntry = jzl0Var.h;
        if (storyEntry == null) {
            return;
        }
        boolean z = !storyEntry.c0;
        StoryBottomViewGroup storyBottomViewGroup = jzl0Var.a;
        ImageView imageView = storyBottomViewGroup.z;
        imageView.performHapticFeedback(0);
        storyBottomViewGroup.V4(z);
        Set<View> set = g6z.a;
        g6z.c(imageView, imageView, z, true, 32);
        io.reactivex.rxjava3.disposables.c cVar = jzl0Var.c;
        if (cVar != null) {
            cVar.dispose();
        }
        nzl0 nzl0Var = jzl0Var.j;
        if (nzl0Var == null) {
            nzl0Var = null;
        }
        jzl0Var.c = nzl0Var.i(storyEntry, z, null).subscribe();
    }

    @Override // xsna.rwl0.a
    public final void a(uwl0 uwl0Var) {
        if ((uwl0Var instanceof uwl0.a.AbstractC3841a.b) || (uwl0Var instanceof uwl0.a.b.C3843a)) {
            nzl0 nzl0Var = this.j;
            (nzl0Var != null ? nzl0Var : null).k();
            return;
        }
        if (uwl0Var.equals(uwl0.a.AbstractC3841a.e.e)) {
            nzl0 nzl0Var2 = this.j;
            (nzl0Var2 != null ? nzl0Var2 : null).c();
            return;
        }
        if (uwl0Var instanceof uwl0.a.AbstractC3841a.C3842a) {
            nzl0 nzl0Var3 = this.j;
            (nzl0Var3 != null ? nzl0Var3 : null).h(new kjj(this, 2));
            return;
        }
        if (uwl0Var instanceof uwl0.a.AbstractC3841a.c) {
            nzl0 nzl0Var4 = this.j;
            (nzl0Var4 != null ? nzl0Var4 : null).s();
            return;
        }
        if (uwl0Var instanceof uwl0.a.b.c.C3847c) {
            nzl0 nzl0Var5 = this.j;
            (nzl0Var5 != null ? nzl0Var5 : null).u(((uwl0.a.b.c.C3847c) uwl0Var).g);
            return;
        }
        if (!(uwl0Var instanceof uwl0.a.b.c)) {
            if (uwl0Var instanceof uwl0.a.b.d) {
                nzl0 nzl0Var6 = this.j;
                (nzl0Var6 != null ? nzl0Var6 : null).v();
                return;
            }
            if (uwl0Var instanceof uwl0.a.b.C3844b) {
                return;
            }
            if (uwl0Var instanceof uwl0.a.AbstractC3841a.d) {
                this.y = true;
                j(this);
                return;
            } else {
                if (!(uwl0Var instanceof uwl0.a.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                StoryEntry storyEntry = this.h;
                if (storyEntry == null) {
                    return;
                }
                storyEntry.Z = 0;
                storyEntry.A = 0;
                nzl0 nzl0Var7 = this.j;
                (nzl0Var7 != null ? nzl0Var7 : null).j();
                return;
            }
        }
        uwl0.a.b.c cVar = (uwl0.a.b.c) uwl0Var;
        if (cVar instanceof uwl0.a.b.c.e) {
            nzl0 nzl0Var8 = this.j;
            (nzl0Var8 != null ? nzl0Var8 : null).f(MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.STORY_REPLY, true);
            return;
        }
        if (cVar instanceof uwl0.a.b.c.C3846b) {
            nzl0 nzl0Var9 = this.j;
            (nzl0Var9 != null ? nzl0Var9 : null).t(((uwl0.a.b.c.C3846b) uwl0Var).h);
            return;
        }
        if (cVar instanceof uwl0.a.b.c.g) {
            nzl0 nzl0Var10 = this.j;
            (nzl0Var10 != null ? nzl0Var10 : null).t(((uwl0.a.b.c.g) uwl0Var).h);
        } else {
            if (cVar instanceof uwl0.a.b.c.d) {
                return;
            }
            if (cVar instanceof uwl0.a.b.c.f) {
                nzl0 nzl0Var11 = this.j;
                (nzl0Var11 != null ? nzl0Var11 : null).f(MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.STORY_REPOST, false);
            } else {
                nzl0 nzl0Var12 = this.j;
                (nzl0Var12 != null ? nzl0Var12 : null).d();
            }
        }
    }

    @Override // xsna.rwl0.a
    public final void b(MotionEvent motionEvent) {
        zlq zlqVar = this.u.b;
        if (zlqVar != null) {
            zlqVar.a(motionEvent);
        }
    }

    @Override // xsna.v2d0
    public final void c(boolean z) {
        StoryBottomViewGroup storyBottomViewGroup = this.a;
        if (z) {
            nzl0 nzl0Var = storyBottomViewGroup.D;
            if (nzl0Var != null) {
                nzl0Var.q();
                return;
            }
            return;
        }
        nzl0 nzl0Var2 = storyBottomViewGroup.D;
        if (nzl0Var2 != null) {
            nzl0Var2.r();
        }
    }

    @Override // xsna.v2d0
    public final View d() {
        com.vk.story.viewer.impl.presentation.stories.view.storyview.b bVar = this.u;
        zlq zlqVar = bVar.b;
        return zlqVar != null ? zlqVar : new View(bVar.a.getContext());
    }

    @Override // xsna.rwl0.a
    public final void e(uwl0 uwl0Var, int i) {
        StoryEntry storyEntry = this.h;
        if (storyEntry == null) {
            return;
        }
        nzl0 nzl0Var = this.j;
        if (nzl0Var == null) {
            nzl0Var = null;
        }
        MobileOfficialAppsConStoriesStat$ViewEntryPoint viewEntryPoint = nzl0Var.getViewEntryPoint();
        nzl0 nzl0Var2 = this.j;
        u8m0 p = (nzl0Var2 != null ? nzl0Var2 : null).p();
        this.t = i;
        StoryBottomViewGroup storyBottomViewGroup = this.a;
        nzl0 nzl0Var3 = storyBottomViewGroup.D;
        if (nzl0Var3 != null ? nzl0Var3.isPlaying() : false) {
            l(false);
        }
        boolean z = uwl0Var instanceof uwl0.a.AbstractC3841a.C3842a;
        com.vk.story.viewer.impl.presentation.stories.view.storyview.b bVar = this.u;
        if (z) {
            bVar.g(storyBottomViewGroup, false, storyEntry, this);
            bVar.i(false, viewEntryPoint, storyEntry, p);
            try {
                storyBottomViewGroup.performHapticFeedback(0);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        if (uwl0Var instanceof uwl0.a.AbstractC3841a.e) {
            bVar.g(storyBottomViewGroup, true, storyEntry, this);
            bVar.i(true, viewEntryPoint, storyEntry, p);
            try {
                storyBottomViewGroup.performHapticFeedback(0);
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // xsna.v2d0
    public final Rect f() {
        return f4m.c(this.a.findViewById(R.id.rv_reactions_action));
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x038c, code lost:
    
        if (r22.Mb() == false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x04a1, code lost:
    
        if (r22.q != false) goto L392;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x02c5  */
    /* JADX WARN: Type inference failed for: r10v5, types: [xsna.uwl0$a, xsna.uwl0$a$a$e] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v5, types: [xsna.uwl0$a] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<uwl0> g(StoryEntry storyEntry, StoriesContainer storiesContainer, VKList<StoryUserProfile> vKList, int i, boolean z) {
        uwl0.a.c cVar;
        int i2;
        boolean z2;
        uwl0.a aVar;
        ClickableClip clickableClip;
        ClickableVideo clickableVideo;
        String str;
        ClickableStickers clickableStickers;
        List<ClickableSticker> list;
        int i3;
        uwl0.a aVar2;
        HashMap<StoryEntry, dt50> hashMap;
        dt50 dt50Var;
        uwl0.a gVar;
        ApiApplication apiApplication;
        List<ClickableSticker> list2;
        ?? r15;
        List<ClickableSticker> list3;
        Object obj;
        uwl0.a.AbstractC3841a.d dVar;
        Integer num;
        uwl0.a aVar3;
        int i4;
        Object obj2;
        ?? r11;
        Integer num2;
        int size;
        int i5;
        Iterator it;
        uwl0.a.b bVar;
        twl0 twl0Var;
        uwl0.a aVar4;
        ClickableClip clickableClip2;
        ClickableVideo clickableVideo2;
        uwl0.a.b.c cVar2;
        uwl0.a.b.c c3845a;
        String e;
        ApiApplication apiApplication2;
        List<ClickableSticker> list4;
        Object obj3;
        List<ClickableSticker> list5;
        Object obj4;
        l5m0 l5m0Var = this.n;
        int i6 = 0;
        if (l5m0Var != null) {
            nzl0 nzl0Var = this.j;
            if (nzl0Var == null) {
                nzl0Var = null;
            }
            VkButton vkButton = l5m0Var.a;
            if (storiesContainer.Rb()) {
                boolean isEmpty = TextUtils.isEmpty(storyEntry.T);
                boolean z3 = storiesContainer.j;
                ClickableStickers clickableStickers2 = storyEntry.X;
                if (clickableStickers2 == null || (list5 = clickableStickers2.d) == null) {
                    clickableClip2 = null;
                } else {
                    Iterator it2 = list5.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = it2.next();
                        if (obj4 instanceof ClickableClip) {
                            break;
                        }
                    }
                    if (!(obj4 instanceof ClickableClip)) {
                        obj4 = null;
                    }
                    clickableClip2 = (ClickableClip) obj4;
                }
                if (clickableStickers2 == null || (list4 = clickableStickers2.d) == null) {
                    clickableVideo2 = null;
                } else {
                    Iterator it3 = list4.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it3.next();
                        if (obj3 instanceof ClickableVideo) {
                            break;
                        }
                    }
                    if (!(obj3 instanceof ClickableVideo)) {
                        obj3 = null;
                    }
                    clickableVideo2 = (ClickableVideo) obj3;
                }
                ClickableApp zb = clickableStickers2 != null ? clickableStickers2.zb() : null;
                String str2 = (zb == null || (apiApplication2 = zb.f) == null) ? null : apiApplication2.c;
                if (str2 == null) {
                    str2 = "";
                }
                boolean z4 = zb != null && myc0.f(str2);
                boolean b = l5m0.b(storyEntry, nzl0Var);
                if (z3) {
                    cVar2 = new uwl0.a.b.c.e(null);
                } else if (b) {
                    cVar2 = new uwl0.a.b.c.f(null);
                } else if (z4) {
                    cVar2 = new uwl0.a.b.c.C3847c(str2, null, zb);
                } else {
                    if (!isEmpty && clickableClip2 != null) {
                        String str3 = storyEntry.T;
                        String str4 = storyEntry.S;
                        if (str4 == null) {
                            str4 = "";
                        }
                        c3845a = new uwl0.a.b.c.C3846b(str4, null, str3, clickableClip2);
                    } else if (!isEmpty && clickableVideo2 != null) {
                        String str5 = storyEntry.T;
                        String str6 = storyEntry.S;
                        if (str6 == null) {
                            str6 = "";
                        }
                        c3845a = new uwl0.a.b.c.g(str6, null, str5, clickableVideo2);
                    } else if (isEmpty) {
                        cVar2 = null;
                    } else {
                        String str7 = storyEntry.T;
                        String str8 = storyEntry.S;
                        if (str8 == null) {
                            str8 = "";
                        }
                        c3845a = new uwl0.a.b.c.C3845a(str8, null, str7);
                    }
                    cVar2 = c3845a;
                }
                if (cVar2 != null) {
                    if (vkButton != null) {
                        if (cVar2 instanceof uwl0.a.b.c.e) {
                            e = vkButton.getContext().getString(R.string.share);
                        } else if ((cVar2 instanceof uwl0.a.b.c.C3845a) || (cVar2 instanceof uwl0.a.b.c.d) || (cVar2 instanceof uwl0.a.b.c.C3846b) || (cVar2 instanceof uwl0.a.b.c.C3847c) || (cVar2 instanceof uwl0.a.b.c.g)) {
                            e = cVar2.e();
                        } else {
                            if (!(cVar2 instanceof uwl0.a.b.c.f)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            e = vkButton.getContext().getString(R.string.add_to_story);
                        }
                        vkButton.setText(e);
                    }
                    if (vkButton != null) {
                        vkButton.setOnClickListener(new wnb(4, cVar2, nzl0Var));
                    }
                    if (vkButton != null) {
                        vkButton.setVisibility(0);
                    }
                } else if (vkButton != null) {
                    f4m.j(vkButton);
                }
            } else if (vkButton != null) {
                f4m.j(vkButton);
            }
        }
        ArrayList arrayList = new ArrayList();
        if ((storyEntry.c == 0 && storyEntry.m0 == null) || storyEntry.b || storyEntry.B) {
            return EmptyList.b;
        }
        boolean Rb = storiesContainer.Rb();
        if (this.k != null) {
            float h = h(z);
            int max = Math.max(vKList.i(), storyEntry.j);
            ArrayList arrayList2 = new ArrayList();
            for (StoryUserProfile storyUserProfile : vKList) {
                if (storyUserProfile.h0) {
                    arrayList2.add(storyUserProfile);
                }
            }
            cVar = new uwl0.a.c(max, Math.max(arrayList2.size(), storyEntry.e0), i);
            if (!Rb) {
                cVar = null;
            }
            if (cVar != null) {
                cVar.a = h;
            }
        } else {
            cVar = null;
        }
        if (Rb) {
            i2 = 0;
            aVar = null;
            z2 = Rb;
        } else {
            vwl0 vwl0Var = this.k;
            if (vwl0Var != null) {
                float h2 = h(z);
                boolean isEmpty2 = TextUtils.isEmpty(storyEntry.T);
                boolean z5 = storiesContainer.j;
                ClickableStickers clickableStickers3 = storyEntry.X;
                if (clickableStickers3 == null || (list3 = clickableStickers3.d) == null) {
                    i2 = 0;
                    clickableClip = null;
                } else {
                    Iterator it4 = list3.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            i2 = i6;
                            obj = null;
                            break;
                        }
                        i2 = i6;
                        obj = it4.next();
                        if (obj instanceof ClickableClip) {
                            break;
                        }
                        i6 = i2;
                    }
                    if (!(obj instanceof ClickableClip)) {
                        obj = null;
                    }
                    clickableClip = (ClickableClip) obj;
                }
                if (clickableStickers3 == null || (list2 = clickableStickers3.d) == null) {
                    clickableVideo = null;
                } else {
                    Iterator it5 = list2.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            r15 = 0;
                            break;
                        }
                        r15 = it5.next();
                        if (r15 instanceof ClickableVideo) {
                            break;
                        }
                    }
                    boolean z6 = r15 instanceof ClickableVideo;
                    ClickableVideo clickableVideo3 = r15;
                    if (!z6) {
                        clickableVideo3 = null;
                    }
                    clickableVideo = clickableVideo3;
                }
                ClickableApp zb2 = clickableStickers3 != null ? clickableStickers3.zb() : null;
                String str9 = (zb2 == null || (apiApplication = zb2.f) == null) ? null : apiApplication.c;
                if (str9 == null) {
                    str9 = "";
                }
                int i7 = (zb2 == null || !myc0.f(str9)) ? i2 : 1;
                nzl0 nzl0Var2 = vwl0Var.b;
                if (BuildInfo.s()) {
                    str = "";
                    if (!nzl0Var2.a(storyEntry.d) && storyEntry.q && storyEntry.D && (clickableStickers = storyEntry.X) != null && (list = clickableStickers.d) != null) {
                        List<ClickableSticker> list6 = list;
                        z2 = Rb;
                        if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                            Iterator it6 = list6.iterator();
                            while (it6.hasNext()) {
                                ClickableSticker clickableSticker = (ClickableSticker) it6.next();
                                Iterator it7 = it6;
                                ClickableMention clickableMention = clickableSticker instanceof ClickableMention ? (ClickableMention) clickableSticker : null;
                                if (clickableMention != null) {
                                    Group group = clickableMention.i;
                                    if (group != null) {
                                        if (group.s > GroupsGroupAdminLevelDto.MODERATOR.i()) {
                                            i3 = 1;
                                            break;
                                        }
                                    } else {
                                        UserId userId = clickableMention.e;
                                        if (userId != null && nzl0Var2.a(userId)) {
                                            i3 = 1;
                                            break;
                                        }
                                    }
                                }
                                it6 = it7;
                            }
                        }
                        i3 = i2;
                        if (!z5) {
                            aVar2 = new uwl0.a.b.c.e(null);
                            aVar2.a = h2;
                        } else if (i3 != 0) {
                            aVar2 = new uwl0.a.b.c.f(null);
                        } else if (i7 != 0) {
                            aVar2 = new uwl0.a.b.c.C3847c(str9, null, zb2);
                            aVar2.a = h2;
                        } else {
                            if (!isEmpty2 && clickableClip != null) {
                                String str10 = storyEntry.T;
                                String str11 = storyEntry.S;
                                if (str11 == null) {
                                    str11 = str;
                                }
                                gVar = new uwl0.a.b.c.C3846b(str11, null, str10, clickableClip);
                                gVar.a = h2;
                            } else if (!isEmpty2 && clickableVideo != null) {
                                String str12 = storyEntry.T;
                                String str13 = storyEntry.S;
                                if (str13 == null) {
                                    str13 = str;
                                }
                                gVar = new uwl0.a.b.c.g(str13, null, str12, clickableVideo);
                            } else if (isEmpty2) {
                                if (storyEntry.Nb()) {
                                    boolean Ob = storyEntry.Ob();
                                    MyTargetAdStoriesContainer myTargetAdStoriesContainer = storiesContainer instanceof MyTargetAdStoriesContainer ? (MyTargetAdStoriesContainer) storiesContainer : null;
                                    String str14 = (myTargetAdStoriesContainer == null || (hashMap = myTargetAdStoriesContainer.o) == null || (dt50Var = hashMap.get(storyEntry)) == null) ? null : dt50Var.e;
                                    if (str14 == null) {
                                        str14 = str;
                                    }
                                    if (!Ob) {
                                        aVar2 = new uwl0.a.b.c.d(str14, null);
                                        aVar2.a = h2;
                                    }
                                }
                                aVar2 = null;
                            } else {
                                String str15 = storyEntry.T;
                                String str16 = storyEntry.S;
                                if (str16 == null) {
                                    str16 = str;
                                }
                                uwl0.a.b.c.C3845a c3845a2 = new uwl0.a.b.c.C3845a(str16, null, str15);
                                c3845a2.a = h2;
                                aVar2 = c3845a2;
                            }
                            aVar2 = gVar;
                        }
                        aVar = aVar2;
                    }
                } else {
                    str = "";
                }
                z2 = Rb;
                i3 = i2;
                if (!z5) {
                }
                aVar = aVar2;
            } else {
                i2 = 0;
                z2 = Rb;
                aVar = null;
            }
        }
        vwl0 vwl0Var2 = this.k;
        uwl0.a.b.d dVar2 = (vwl0Var2 != null && storyEntry.Nb() && vwl0Var2.b.l()) ? new uwl0.a.b.d(null) : null;
        if (this.k != null) {
            float h3 = h(z);
            dVar = new uwl0.a.AbstractC3841a.d(storyEntry.c0);
            dVar.a = h3;
            if (!z2) {
                if (storyEntry.C) {
                    if (!storyEntry.F) {
                    }
                }
            }
        }
        dVar = null;
        vwl0 vwl0Var3 = this.k;
        if (vwl0Var3 != null) {
            int i8 = aVar != null ? 1 : i2;
            int i9 = (!storyEntry.r || storiesContainer.Rb()) ? i2 : 1;
            int i10 = (storyEntry.r || storiesContainer.Rb() || i8 == 0) ? i2 : 1;
            int i11 = (storyEntry.r || storiesContainer.Rb() || i8 != 0) ? i2 : 1;
            float floatValue = ((Number) vwl0Var3.a.invoke(Boolean.valueOf((boolean) ((!z && i11 == 0 && i10 == 0) ? i2 : 1)))).floatValue();
            int i12 = (!storyEntry.Mb() || storyEntry.F) ? i2 : 1;
            if (storyEntry.C && !storyEntry.F) {
                if (i12 != 0) {
                    aVar4 = uwl0.a.AbstractC3841a.c.e;
                } else if ((i9 != 0 && i8 != 0) || i10 != 0) {
                    uwl0.a.AbstractC3841a.b bVar2 = uwl0.a.AbstractC3841a.b.e;
                    bVar2.a = floatValue;
                    aVar4 = bVar2;
                } else if (i9 != 0 || i11 != 0) {
                    num = null;
                    uwl0.a.b.C3843a c3843a = new uwl0.a.b.C3843a(null);
                    c3843a.a = floatValue;
                    aVar4 = c3843a;
                    aVar3 = aVar4;
                }
                num = null;
                aVar3 = aVar4;
            }
            num = null;
            aVar4 = null;
            aVar3 = aVar4;
        } else {
            num = null;
            aVar3 = null;
        }
        if (this.k != null) {
            obj2 = new uwl0.a.b.C3844b(num);
            uwl0.a[] aVarArr = new uwl0.a[2];
            aVarArr[i2] = aVar;
            i4 = 1;
            aVarArr[1] = aVar3;
            List l = e43.l(aVarArr);
            if (!(l instanceof Collection) || !l.isEmpty()) {
                Iterator it8 = l.iterator();
                while (it8.hasNext()) {
                    if (((uwl0.a) it8.next()) instanceof uwl0.a.b) {
                    }
                }
            }
            if (this.k == null) {
                float h4 = h(z);
                int i13 = (z2 && storyEntry.o0 && !(storiesContainer instanceof HighlightStoriesContainer)) ? i4 : i2;
                r11 = new uwl0.a.AbstractC3841a.C3842a(storyEntry.n0 > 0 ? i4 : i2);
                if (i13 == 0) {
                    r11 = num;
                }
                if (r11 != 0) {
                    r11.a = h4;
                }
            } else {
                r11 = num;
            }
            if (this.k != null) {
                float h5 = h(z);
                ?? r10 = uwl0.a.AbstractC3841a.e.e;
                r10.a = h5;
                num2 = r10;
            }
            num2 = num;
            arrayList.add(cVar);
            arrayList.add(aVar);
            arrayList.add(dVar2);
            arrayList.add(obj2);
            arrayList.add(aVar3);
            if (!this.g) {
                StoriesFeatures storiesFeatures = StoriesFeatures.ST_NEW_REACTIONS;
                storiesFeatures.getClass();
                com.vk.toggle.b bVar3 = com.vk.toggle.b.A;
                if (!bVar3.a(storiesFeatures)) {
                    StoriesFeatures storiesFeatures2 = StoriesFeatures.ST_REACTION_STICKER;
                    storiesFeatures2.getClass();
                    if (!bVar3.a(storiesFeatures2)) {
                        arrayList.add(dVar);
                    }
                }
            }
            arrayList.add(r11);
            if (!(aVar instanceof uwl0.a.b.c.e)) {
                arrayList.add(num2);
            }
            List V = j5g.V(arrayList);
            size = ((ArrayList) V).size();
            i5 = this.t;
            if (size > i5) {
                uwl0 uwl0Var = (uwl0) j5g.b0(i5, V);
                if (uwl0Var instanceof uwl0.a) {
                    ((uwl0.a) uwl0Var).a = 1.0f;
                }
            }
            ArrayList arrayList3 = new ArrayList(j5g.V(arrayList));
            ArrayList arrayList4 = new ArrayList();
            it = arrayList3.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof uwl0.a.b) {
                    arrayList4.add(next);
                }
            }
            bVar = (uwl0.a.b) j5g.a0(arrayList4);
            if (bVar != null) {
                ArrayList arrayList5 = new ArrayList();
                Iterator it9 = arrayList3.iterator();
                while (it9.hasNext()) {
                    Object next2 = it9.next();
                    if (!(((uwl0) next2) instanceof uwl0.a.b)) {
                        arrayList5.add(next2);
                    }
                }
                Iterator it10 = arrayList5.iterator();
                int i14 = i2;
                while (true) {
                    boolean hasNext = it10.hasNext();
                    twl0Var = this.b;
                    if (!hasNext) {
                        break;
                    }
                    uwl0 uwl0Var2 = (uwl0) it10.next();
                    cc<?> a = twl0Var.a(twl0Var.b, uwl0Var2.b(), twl0Var.c);
                    a.h6(uwl0Var2);
                    View view = a.itemView;
                    int i15 = twl0Var.d;
                    view.measure(i15, i15);
                    i14 += a.itemView.getMeasuredWidth();
                }
                float f = 10;
                uwl0.a.b d = bVar.d(Integer.valueOf((twl0Var.a.getResources().getDisplayMetrics().widthPixels - i14) - (iah0.a(f) + (arrayList5.isEmpty() ? iah0.a(f) : iah0.a(6)))));
                d.a = bVar.a;
                int indexOf = arrayList3.indexOf(bVar);
                arrayList3.remove(indexOf);
                arrayList3.add(indexOf, d);
            }
            return arrayList3;
        }
        i4 = 1;
        obj2 = num;
        if (this.k == null) {
        }
        if (this.k != null) {
        }
        num2 = num;
        arrayList.add(cVar);
        arrayList.add(aVar);
        arrayList.add(dVar2);
        arrayList.add(obj2);
        arrayList.add(aVar3);
        if (!this.g) {
        }
        arrayList.add(r11);
        if (!(aVar instanceof uwl0.a.b.c.e)) {
        }
        List V2 = j5g.V(arrayList);
        size = ((ArrayList) V2).size();
        i5 = this.t;
        if (size > i5) {
        }
        ArrayList arrayList32 = new ArrayList(j5g.V(arrayList));
        ArrayList arrayList42 = new ArrayList();
        it = arrayList32.iterator();
        while (it.hasNext()) {
        }
        bVar = (uwl0.a.b) j5g.a0(arrayList42);
        if (bVar != null) {
        }
        return arrayList32;
    }

    public final io.reactivex.rxjava3.core.q<tnm0> i(StoryEntry storyEntry, LoadStrategy loadStrategy) {
        int i = storyEntry.c;
        if (i == 0) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        nzl0 nzl0Var = this.j;
        if (nzl0Var == null) {
            nzl0Var = null;
        }
        return nzl0Var.o(new v3u0(storyEntry.d, i, 10, "", true), loadStrategy);
    }

    public final void k(StoriesContainer storiesContainer, StoryEntry storyEntry) {
        int i;
        StoryEntry storyEntry2;
        int i2;
        int indexOf = storiesContainer.g.indexOf(storyEntry);
        LinkedHashSet linkedHashSet = this.q;
        if (indexOf > -1 && storiesContainer.g.size() > (i = indexOf + 1) && (storyEntry2 = (StoryEntry) j5g.b0(i, storiesContainer.g)) != null && (i2 = storyEntry2.c) != 0 && !linkedHashSet.contains(Integer.valueOf(i2))) {
            this.d.dispose();
            io.reactivex.rxjava3.core.q<tnm0> i3 = i(storyEntry2, LoadStrategy.ONLY_API);
            asu0 asu0Var = asu0.a;
            this.d = i3.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new k2y(new lyb0(4, this, storyEntry2), 17), new qw40(new mcl0(2), 17));
        }
        LoadStrategy loadStrategy = linkedHashSet.contains(Integer.valueOf(storyEntry.c)) ? LoadStrategy.ONLY_CACHE : LoadStrategy.CACHE_FIRST;
        Triple<? extends StoryEntry, Long, ? extends LoadStrategy> triple = this.x;
        if (triple != null) {
            StoryEntry d = triple.d();
            long longValue = triple.g().longValue();
            LoadStrategy h = triple.h();
            if (SystemClock.elapsedRealtime() - longValue < 200 && h == loadStrategy && storyEntry.Kb().equals(d.Kb())) {
                return;
            }
        }
        this.x = new Triple<>(storyEntry, Long.valueOf(SystemClock.elapsedRealtime()), loadStrategy);
        this.e.dispose();
        io.reactivex.rxjava3.core.q<tnm0> i4 = i(storyEntry, loadStrategy);
        asu0 asu0Var2 = asu0.a;
        this.e = i4.r0(asu0Var2.c()).a0(asu0Var2.d()).subscribe(new jw80(new j4c(this, loadStrategy, storyEntry, storiesContainer, 3), 15), new m330(new wh9(this, storyEntry, storiesContainer, 10), 27));
    }

    public final void l(final boolean z) {
        final StoryEntry storyEntry = this.h;
        if (storyEntry == null) {
            return;
        }
        StoryBottomViewGroup storyBottomViewGroup = this.a;
        nzl0 nzl0Var = storyBottomViewGroup.D;
        if (nzl0Var != null ? nzl0Var.isPlaying() : false) {
            storyBottomViewGroup.post(new l96(3, this, storyEntry));
        } else {
            storyBottomViewGroup.post(new Runnable() { // from class: xsna.hzl0
                @Override // java.lang.Runnable
                public final void run() {
                    jzl0 jzl0Var = jzl0.this;
                    StoriesContainer storiesContainer = jzl0Var.i;
                    StoriesContainer storiesContainer2 = storiesContainer == null ? null : storiesContainer;
                    VKList<StoryUserProfile> vKList = jzl0Var.o;
                    int i = jzl0Var.p;
                    StoryEntry storyEntry2 = storyEntry;
                    boolean z2 = z;
                    jzl0Var.a.setActionItems(jzl0Var.g(storyEntry2, storiesContainer2, vKList, i, z2));
                    l5m0 l5m0Var = jzl0Var.n;
                    if (l5m0Var != null) {
                        float h = jzl0.h(z2);
                        nzl0 nzl0Var2 = jzl0Var.j;
                        l5m0Var.a(storyEntry2, h, nzl0Var2 != null ? nzl0Var2 : null);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(StoryEntry storyEntry, boolean z) {
        boolean z2;
        this.h = storyEntry;
        StoriesContainer storiesContainer = this.i;
        if (storiesContainer == null) {
            return;
        }
        if (storiesContainer.Rb() && !storyEntry.b) {
            nzl0 nzl0Var = this.j;
            if (nzl0Var == null) {
                nzl0Var = null;
            }
            if (!nzl0Var.e()) {
                z2 = true;
                if (z || !z2) {
                    StoriesContainer storiesContainer2 = this.i;
                    this.a.setActionItems(g(storyEntry, storiesContainer2 != null ? null : storiesContainer2, this.o, this.p, false));
                } else {
                    StoriesContainer storiesContainer3 = this.i;
                    k(storiesContainer3 != null ? storiesContainer3 : null, storyEntry);
                    return;
                }
            }
        }
        z2 = false;
        if (z) {
        }
        StoriesContainer storiesContainer22 = this.i;
        this.a.setActionItems(g(storyEntry, storiesContainer22 != null ? null : storiesContainer22, this.o, this.p, false));
    }
}

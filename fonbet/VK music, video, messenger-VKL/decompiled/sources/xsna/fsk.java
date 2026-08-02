package xsna;

import android.content.Context;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.board.dto.BoardGetTopicsExtendedResponseDto;
import com.vk.api.generated.board.dto.BoardTopicDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.dto.common.Image;
import com.vk.dto.common.TimelineThumbs;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.AppGroupedStoriesContainer;
import com.vk.dto.stories.model.DiscoverStoriesContainer;
import com.vk.dto.stories.model.LiveActiveStoriesContainer;
import com.vk.dto.stories.model.LiveFinishedStoriesContainer;
import com.vk.dto.stories.model.LiveStubStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.onlinebooking.impl.model.BookingServiceModel;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.mediastore.storage.ClipsVideoStorage;
import com.vk.navigation.NavigationDelegateActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.builders.MapBuilder;
import kotlin.text.Regex;
import xsna.xja0;

/* compiled from: DarkComposeThemeProvider.kt */
/* loaded from: classes17.dex */
public final class fsk implements ixj, jp70, xmf, io.reactivex.rxjava3.functions.k, qge0 {
    public static final fsk b = new fsk();
    public static volatile zqw c = new hpt0();
    public static final fsk d = new fsk();
    public static final mb2 e = new mb2(IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
    public static fsk f;

    public fsk(int i) {
        switch (i) {
            case 16:
                new AtomicBoolean(false);
                break;
        }
    }

    public static final boolean A(StoriesContainer storiesContainer) {
        return (storiesContainer instanceof LiveActiveStoriesContainer) || (storiesContainer instanceof LiveStubStoriesContainer);
    }

    public static final boolean B(StoriesContainer storiesContainer) {
        StoryEntry storyEntry;
        return storiesContainer.Eb() && (storyEntry = (StoryEntry) j5g.a0(storiesContainer.g)) != null && storyEntry.N;
    }

    public static fj7 C(BoardGetTopicsExtendedResponseDto boardGetTopicsExtendedResponseDto, izs izsVar, izs izsVar2, String str, HashMap hashMap) {
        UserProfile userProfile;
        MapBuilder mapBuilder = new MapBuilder();
        if (hashMap != null) {
            mapBuilder.putAll(hashMap);
        }
        List<GroupsGroupFullDto> f2 = boardGetTopicsExtendedResponseDto.f();
        ArrayList arrayList = new ArrayList(c5g.u(f2, 10));
        for (GroupsGroupFullDto groupsGroupFullDto : f2) {
            UserProfile userProfile2 = new UserProfile();
            userProfile2.c = new UserId(-groupsGroupFullDto.P0().b);
            userProfile2.d = groupsGroupFullDto.y1();
            userProfile2.f = "";
            userProfile2.e = userProfile2.d + ' ' + userProfile2.f;
            userProfile2.g = groupsGroupFullDto.V1();
            arrayList.add(userProfile2);
        }
        HashMap hashMap2 = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            hashMap2.put(Long.valueOf(((UserProfile) next).c.b), next);
        }
        mapBuilder.putAll(hashMap2);
        List<UsersUserFullDto> i = boardGetTopicsExtendedResponseDto.i();
        ArrayList arrayList2 = new ArrayList(c5g.u(i, 10));
        for (UsersUserFullDto usersUserFullDto : i) {
            new j2r0();
            arrayList2.add(j2r0.a(usersUserFullDto));
        }
        HashMap hashMap3 = new HashMap(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            hashMap3.put(Long.valueOf(((UserProfile) next2).c.b), next2);
        }
        mapBuilder.putAll(hashMap3);
        MapBuilder h = mapBuilder.h();
        List<BoardTopicDto> g = boardGetTopicsExtendedResponseDto.g();
        ArrayList arrayList3 = new ArrayList(c5g.u(g, 10));
        Iterator<T> it3 = g.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            BoardTopicDto boardTopicDto = (BoardTopicDto) it3.next();
            ii7 ii7Var = new ii7(0);
            Integer g2 = boardTopicDto.g();
            if (g2 != null) {
                ii7Var.a = g2.intValue();
            }
            String title = boardTopicDto.getTitle();
            if (title != null) {
                ii7Var.b = cqm0.f(title);
            }
            Integer d2 = boardTopicDto.d();
            if (d2 != null) {
                ii7Var.c = d2.intValue();
            }
            Integer e2 = boardTopicDto.e();
            if (e2 != null) {
                ii7Var.d = e2.intValue();
            }
            Integer j = boardTopicDto.j();
            if (j != null) {
                ii7Var.e = j.intValue();
            }
            UserId f3 = boardTopicDto.f();
            if (f3 != null) {
                ii7Var.h = f3;
            }
            BaseBoolIntDto l = boardTopicDto.l();
            BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
            if (l == baseBoolIntDto) {
                ii7Var.g = 1 | ii7Var.g;
            }
            if (boardTopicDto.n() == baseBoolIntDto) {
                ii7Var.g |= 2;
            }
            Integer d3 = boardTopicDto.d();
            if (d3 != null) {
                ii7Var.c = d3.intValue();
            }
            String i2 = boardTopicDto.i();
            if (i2 != null) {
                CharSequence charSequence = (CharSequence) izsVar.invoke(new Regex("\\[(id|club)[0-9]+(?::bp[-_0-9]+)?\\|([^\\]]+)\\]").g(i2, "$2"));
                if (charSequence instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class);
                    if (characterStyleArr != null) {
                        for (CharacterStyle characterStyle : characterStyleArr) {
                            spannableStringBuilder.removeSpan(characterStyle);
                        }
                    }
                }
                CharSequence charSequence2 = (CharSequence) izsVar2.invoke(charSequence);
                if (charSequence2.length() == 0) {
                    charSequence2 = str;
                }
                ii7Var.i = charSequence2;
            }
            UserId k = boardTopicDto.k();
            if (k == null || (userProfile = (UserProfile) h.get(Long.valueOf(k.b))) == null) {
                UserId f4 = boardTopicDto.f();
                userProfile = f4 != null ? (UserProfile) h.get(Long.valueOf(f4.b)) : null;
            }
            ii7Var.j = userProfile;
            arrayList3.add(ii7Var);
        }
        return new fj7(boardGetTopicsExtendedResponseDto.e().i(), new VKList(arrayList3), boardGetTopicsExtendedResponseDto.d() == BaseBoolIntDto.YES);
    }

    public static ArrayList D(List list) {
        xm40 xm40Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lhz lhzVar = (lhz) it.next();
            if (lhzVar == null) {
                xm40Var = null;
            } else {
                boolean z = lhzVar.e;
                long j = lhzVar.a;
                my1.a(j);
                xm40Var = new xm40(j, lhzVar.c, lhzVar.d, lhzVar.b, lhzVar.f, z);
            }
            if (xm40Var != null) {
                arrayList.add(xm40Var);
            }
        }
        return arrayList;
    }

    public static float E(androidx.compose.runtime.a aVar) {
        aVar.K(-1525852107);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1525852107, 0, -1, "com.vk.core.compose.component.defaults.CellDefaults.middleContentSpace (VkCellDefaults.kt:129)");
        }
        float f2 = 2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return f2;
    }

    public static void F(androidx.compose.runtime.a aVar) {
        aVar.K(-790278988);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-790278988, 0, -1, "com.vk.core.compose.component.defaults.CellDefaults.middleVerticalContentPadding (VkCellDefaults.kt:132)");
        }
        float f2 = kqu0.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public static final CatalogViewType I(String str) {
        Object obj;
        try {
            Iterator<E> it = CatalogViewType.i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((CatalogViewType) obj).getId(), str)) {
                    break;
                }
            }
            CatalogViewType catalogViewType = (CatalogViewType) obj;
            return catalogViewType == null ? Q(str) : catalogViewType;
        } catch (Exception unused) {
            return Q(str);
        }
    }

    public static final void J(bzs0 bzs0Var, String str, TimelineThumbs timelineThumbs) {
        int i = 0;
        for (Object obj : timelineThumbs.i) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            ver0.a(bzs0Var.A(i, str, (String) obj).subscribe(new vii0(new a74((byte) 0, 4), 7)));
            i = i2;
        }
    }

    public static final void K(bzs0 bzs0Var, String str, String str2) {
        ver0.a(bzs0Var.i(str, str2).subscribe(new wii0(new bv4((byte) 0, 9), 12)));
    }

    public static final void L(bzs0 bzs0Var, String str, Image image) {
        ver0.a(bzs0Var.o(image, str).subscribe(new mh40(new mq2(13), 20)));
    }

    public static final String M(int i) {
        return lhg.a(i, "narrative");
    }

    public static final String N(UserId userId) {
        return "story" + userId.b;
    }

    public static final List O(StoriesContainer storiesContainer) {
        if (!(storiesContainer instanceof AppGroupedStoriesContainer)) {
            return storiesContainer.g;
        }
        ArrayList arrayList = new ArrayList(storiesContainer.g);
        Iterator<T> it = ((AppGroupedStoriesContainer) storiesContainer).o.iterator();
        while (it.hasNext()) {
            g5g.y(O((StoriesContainer) it.next()), arrayList);
        }
        return arrayList;
    }

    public static final io.reactivex.rxjava3.core.q P(til0 til0Var, Context context) {
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(til0Var, null, null, 3);
        uc00 uc00Var = uc00.a;
        return io.reactivex.rxjava3.core.q.I0(y0, new io.reactivex.rxjava3.internal.operators.single.v(new ivz(context, 1)).q(io.reactivex.rxjava3.schedulers.a.b()).w(), new ox0(new mq2(8), 29));
    }

    public static final CatalogViewType Q(String str) {
        L.l("Catalog", air.b('\"', "UNKNOWN VIEW_TYPE=\"", str));
        return CatalogViewType.UNKNOWN;
    }

    public static final CancellationException j(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[LOOP:0: B:4:0x0017->B:16:0x0054, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[EDGE_INSN: B:17:0x005d->B:18:0x005d BREAK  A[LOOP:0: B:4:0x0017->B:16:0x0054], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final t6i l(DialogsHistory dialogsHistory) {
        boolean z;
        t6i t6iVar = new t6i(gkx0.e, gkx0.d);
        if (!dialogsHistory.isEmpty()) {
            Iterator<Dialog> it = dialogsHistory.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Dialog next = it.next();
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                Dialog dialog = next;
                if (!dialogsHistory.d().contains(dialog.Sb())) {
                    Msg msg = dialogsHistory.s().get(dialog.Sb());
                    if (!(msg != null ? msg.H6() : false)) {
                        z = false;
                        if (!z) {
                            break;
                        }
                        i++;
                    }
                }
                z = true;
                if (!z) {
                }
            }
            if (i == -1) {
                return new t6i(((Dialog) j5g.h0(dialogsHistory)).nc(), ((Dialog) j5g.X(dialogsHistory)).nc());
            }
            if (i != 0) {
                return new t6i(dialogsHistory.k().get(i - 1).nc(), ((Dialog) j5g.X(dialogsHistory)).nc());
            }
        }
        return t6iVar;
    }

    public static void m() {
        obr.f("Not in application's main thread", Looper.getMainLooper().getThread() == Thread.currentThread());
    }

    public static float n(float f2, float f3, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1528360391, i, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:77)");
        }
        long j = ((l5g) aVar.r(yfj.a)).a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1462282791, 6, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:97)");
        }
        k9g k9gVar = (k9g) aVar.r(l9g.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (!k9gVar.d() ? f870.E(j) >= 0.5d : f870.E(j) <= 0.5d) {
            f2 = f3;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f2;
    }

    public static u890 o(androidx.compose.runtime.a aVar) {
        aVar.K(-75099059);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-75099059, 0, -1, "com.vk.core.compose.component.defaults.CellDefaults.contentPaddings (VkCellDefaults.kt:151)");
        }
        float f2 = kqu0.b;
        float f3 = 0;
        u890 u890Var = new u890(f2, f3, f2, f3);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return u890Var;
    }

    public static ozb0 p(ozb0 ozb0Var, boolean z, boolean z2, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            z = ozb0Var.a;
        }
        if ((i3 & 2) != 0) {
            z2 = ozb0Var.b;
        }
        if ((i3 & 4) != 0) {
            i = ozb0Var.c;
        }
        if ((i3 & 8) != 0) {
            i2 = ozb0Var.d;
        }
        return (z == ozb0Var.a && z2 == ozb0Var.b && i == ozb0Var.c && i2 == ozb0Var.d) ? ozb0Var : new ozb0(i, i2, z, z2);
    }

    public static final double q(int i, int i2) {
        return ((i << 27) + i2) / 9.007199254740992E15d;
    }

    public static float r(int i, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(621183615, i, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:60)");
        }
        float n = n(0.38f, 0.38f, aVar, ((i << 6) & 896) | 54);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return n;
    }

    public static float s(int i, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(629162431, i, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:36)");
        }
        float n = n(1.0f, 0.87f, aVar, ((i << 6) & 896) | 54);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return n;
    }

    public static zqw t() {
        return c;
    }

    public static io.reactivex.rxjava3.internal.operators.completable.y u(NavigationDelegateActivity navigationDelegateActivity, NewsfeedOptionalAdsComponent newsfeedOptionalAdsComponent) {
        io.reactivex.rxjava3.internal.operators.completable.m mVar = new io.reactivex.rxjava3.internal.operators.completable.m(new w0n(navigationDelegateActivity, newsfeedOptionalAdsComponent, 1));
        asu0.a.getClass();
        return mVar.q(asu0.m());
    }

    public static bkg0 v(String str, gzs gzsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1279589311, i, -1, "com.vk.core.compose.component.search.Search.Right.Clear.Companion.invoke (Search.kt:80)");
        }
        int i3 = (i >> 9) & 14;
        int i4 = i << 3;
        int i5 = (i4 & 7168) | i3 | (i4 & 112) | (i4 & 896);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-938878418, i5, -1, "com.vk.core.compose.component.search.right.remember (RightClearImpl.kt:45)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new bkg0(str, gzsVar);
            aVar.R(x);
        }
        bkg0 bkg0Var = (bkg0) x;
        ((zak0) bkg0Var.a).setValue(str);
        ((zak0) bkg0Var.c).setValue(gzsVar);
        ((zak0) bkg0Var.b).setValue(null);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return bkg0Var;
    }

    public static final boolean w(List list) {
        if (list.isEmpty()) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!((BookingServiceModel) it.next()).j) {
                return false;
            }
        }
        return true;
    }

    public static final boolean x(StoriesContainer storiesContainer) {
        return A(storiesContainer) || (storiesContainer instanceof LiveFinishedStoriesContainer);
    }

    public static boolean y(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static final boolean z(StoriesContainer storiesContainer) {
        return (storiesContainer instanceof AppGroupedStoriesContainer) || (storiesContainer instanceof DiscoverStoriesContainer);
    }

    public void G() {
        throw null;
    }

    public void H() {
        throw null;
    }

    @Override // xsna.xmf
    public void a(sht0 sht0Var) {
        ClipsVideoStorage clipsVideoStorage = ClipsVideoStorage.a;
        String uri = sht0Var.b.toString();
        clipsVideoStorage.getClass();
        ClipsVideoStorage.e(uri);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.functions.k
    public Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return ((Boolean) obj).booleanValue() ? new xja0.a((kr5) obj2, (String) obj3, (String) obj4, (cjk0) obj5, (cjk0) ((it80) obj6).a, ((Boolean) obj7).booleanValue()) : xja0.b.a;
    }

    @Override // xsna.xmf
    public io.reactivex.rxjava3.subjects.e c() {
        ClipsVideoStorage.a.getClass();
        return ClipsVideoStorage.d;
    }

    @Override // xsna.xmf
    public boolean d() {
        ClipsVideoStorage.a.getClass();
        return ClipsVideoStorage.d();
    }

    @Override // xsna.ixj
    public void e(yzs yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(424494431);
        if ((i & 6) == 0) {
            i2 = (M.y(yzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(424494431, i2, -1, "com.vk.design.demo.presentation.screens.ModalCardScreenContent.getComposeBottomContent.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (ModalCardScreenContent.kt:324)");
            }
            yzsVar.invoke(9, M, Integer.valueOf(((i2 << 3) & 112) | 6));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b220(this, yzsVar, i, 1);
        }
    }

    @Override // xsna.xmf
    public void f(sht0 sht0Var) {
        j7q c2;
        b9o e2;
        ClipsVideoStorage clipsVideoStorage = ClipsVideoStorage.a;
        String uri = sht0Var.b.toString();
        clipsVideoStorage.getClass();
        if (ClipsVideoStorage.d() && (c2 = ClipsVideoStorage.c()) != null && uri != null && (e2 = c2.e()) != null) {
            e2.h(uri);
        }
        io.reactivex.rxjava3.disposables.c cVar = ClipsVideoStorage.g;
        if (cVar != null) {
            cVar.dispose();
        }
        ClipsVideoStorage.g = null;
    }

    @Override // xsna.jp70
    public Object h() {
        return new TreeMap();
    }

    public void k(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        androidx.compose.runtime.a M = aVar.M(537363799);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(537363799, i, -1, "com.vk.core.view.theme.DarkComposeThemeProvider.Theme (DarkComposeThemeProvider.kt:8)");
            }
            rrv0.e(true, null, null, null, null, null, kai.c(1638668474, new esk(jaiVar, 0, (byte) 0), M), M, 1572870, 62);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jkd(this, jaiVar, i, 2);
        }
    }

    @Override // xsna.xmf
    public void stop() {
        j7q c2;
        b9o b9oVar;
        ClipsVideoStorage.a.getClass();
        if (ClipsVideoStorage.d() && (c2 = ClipsVideoStorage.c()) != null && (b9oVar = c2.n) != null) {
            b9oVar.c();
        }
        io.reactivex.rxjava3.disposables.c cVar = ClipsVideoStorage.g;
        if (cVar != null) {
            cVar.dispose();
        }
        ClipsVideoStorage.g = null;
    }

    @Override // xsna.qge0
    public void g() {
    }

    @Override // xsna.qge0
    public void i(int i, int i2) {
    }
}

package xsna;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.picture.c;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.NarrativePublishEventType;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.hf6;
import xsna.ikv0;
import xsna.uam0;

/* compiled from: SelectHighlightsDialogController.kt */
/* loaded from: classes6.dex */
public final class s8i0 implements m0q0, tb0, w8i {
    public final Activity b;
    public final Window c;
    public final UserId d;
    public final StoryEntry e;
    public final fz50 f;
    public final mh4 g;
    public final LinkedHashSet<Narrative> h;
    public final MobileOfficialAppsCoreNavStat$EventScreen i;
    public final boolean j;
    public final StoryBottomViewGroup k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final io.reactivex.rxjava3.disposables.b p;
    public ba40 q;
    public izs<? super Boolean, s3q0> r;
    public final HashSet<Narrative> s;
    public final HashSet t;
    public dw20 u;
    public final ArrayList v;
    public boolean w;
    public t8i0 x;

    /* compiled from: SelectHighlightsDialogController.kt */
    public static final class a extends zif0 {
        public static final a a = new a();

        @Override // xsna.zif0
        public final int b() {
            return R.layout.item_create_highlight_redesign;
        }
    }

    /* compiled from: SelectHighlightsDialogController.kt */
    public final class b extends hf6.a implements View.OnClickListener {
        public final StoryEntry m;
        public final MobileOfficialAppsCoreNavStat$EventScreen n;
        public final boolean o;

        public b(View view, StoryEntry storyEntry, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, boolean z) {
            super(view);
            this.m = storyEntry;
            this.n = mobileOfficialAppsCoreNavStat$EventScreen;
            this.o = z;
            view.setOnClickListener(this);
            VkAvatar vkAvatar = (VkAvatar) view.findViewById(R.id.cover_image_view);
            if (vkAvatar != null) {
                vkAvatar.setContent(new c.a(new gko(R.drawable.vk_icon_add_outline_28), new z7g(R.color.vk_white)));
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            StoryEntry storyEntry;
            if (jjc.b()) {
                return;
            }
            s8i0 s8i0Var = s8i0.this;
            ((j6v) s8i0Var.m.getValue()).f(NarrativePublishEventType.CREATE_NARRATIVE, this.n, null);
            if (!s8i0Var.w || (storyEntry = this.m) == null) {
                s8i0Var.d(this.o ? R.string.highlight_create_description_group : R.string.highlight_create_description);
            } else {
                s8i0Var.a(storyEntry);
            }
        }
    }

    /* compiled from: SelectHighlightsDialogController.kt */
    public static final class c extends zif0 {
        public final Narrative a;

        public c(Narrative narrative) {
            this.a = narrative;
        }

        @Override // xsna.zif0
        public final long a() {
            return this.a.b;
        }

        @Override // xsna.zif0
        public final int b() {
            return R.layout.pds_item_select_highlight;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "HighlightItem(highlight=" + this.a + ')';
        }
    }

    /* compiled from: SelectHighlightsDialogController.kt */
    public final class d extends hf6<c> implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
        public final Set<Narrative> m;
        public final ajd0 n;
        public final CheckBox o;
        public final TextView p;
        public final VkAvatar q;

        public d(View view, LinkedHashSet linkedHashSet, ajd0 ajd0Var) {
            super(view);
            this.m = linkedHashSet;
            this.n = ajd0Var;
            this.o = (CheckBox) view.findViewById(R.id.check);
            this.p = (TextView) view.findViewById(R.id.highlight_name);
            this.q = (VkAvatar) view.findViewById(R.id.cover_image);
            view.setOnClickListener(this);
        }

        @Override // xsna.hf6
        public final void W5(c cVar) {
            CheckBox checkBox = this.o;
            checkBox.setOnCheckedChangeListener(null);
            Narrative narrative = cVar.a;
            checkBox.setChecked(this.m.contains(narrative));
            if (checkBox.isChecked()) {
                checkBox.setVisibility(0);
                checkBox.setBackground(m33.a(R.drawable.white_oval, this.itemView.getContext()));
            } else {
                checkBox.setBackground(null);
                checkBox.setVisibility(4);
            }
            checkBox.setOnCheckedChangeListener(this);
            this.p.setText(narrative.d);
            Serializer.c<Narrative> cVar2 = Narrative.CREATOR;
            VkAvatar vkAvatar = this.q;
            int i = vkAvatar.getLayoutParams().width;
            HighlightCover highlightCover = narrative.e;
            String e = highlightCover != null ? highlightCover.e(i) : null;
            if (e == null || e.length() == 0) {
                vkAvatar.setContent(new c.a(new gko(R.drawable.vk_icon_narrative_active_outline_24), new z7g(R.color.vk_gray_600)));
            } else {
                vkAvatar.setContent(new c.d(e, null));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Set<Narrative> set = this.m;
            CheckBox checkBox = this.o;
            if (z) {
                checkBox.setVisibility(0);
                checkBox.setBackground(m33.a(R.drawable.white_oval, this.itemView.getContext()));
                Set<Narrative> set2 = set;
                Object obj = this.l;
                set2.add(((c) (obj != null ? obj : null)).a);
            } else {
                checkBox.setVisibility(4);
                checkBox.setBackground(null);
                Set<Narrative> set3 = set;
                Object obj2 = this.l;
                set3.remove(((c) (obj2 != null ? obj2 : null)).a);
            }
            this.n.invoke();
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.o.toggle();
        }
    }

    /* compiled from: SelectHighlightsDialogController.kt */
    public static final class e extends zif0 {
        @Override // xsna.zif0
        public final int b() {
            return R.layout.pds_item_select_highlight_list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "HighlightItemList(highlightList=null)";
        }
    }

    /* compiled from: SelectHighlightsDialogController.kt */
    public final class f extends hf6<e> {
        public final t8i0 m;

        public f(s8i0 s8i0Var, View view) {
            super(view);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
            t8i0 t8i0Var = new t8i0(s8i0Var);
            this.m = t8i0Var;
            recyclerView.setAdapter(t8i0Var);
        }

        @Override // xsna.hf6
        public final void W5(e eVar) {
            this.m.setItems(null);
        }
    }

    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, kotlin.Lazy] */
    public s8i0(Activity activity, Window window, StoryEntry storyEntry, fz50 fz50Var, mh4 mh4Var, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, boolean z, StoryBottomViewGroup storyBottomViewGroup) {
        UserId userId = storyEntry.d;
        LinkedHashSet<Narrative> linkedHashSet = new LinkedHashSet<>();
        this.b = activity;
        this.c = window;
        this.d = userId;
        this.e = storyEntry;
        this.f = fz50Var;
        this.g = mh4Var;
        this.h = linkedHashSet;
        this.i = mobileOfficialAppsCoreNavStat$EventScreen;
        this.j = z;
        this.k = storyBottomViewGroup;
        ye80 ye80Var = new ye80(this, 13);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l = msy.a(lazyThreadSafetyMode, ye80Var);
        this.m = msy.a(lazyThreadSafetyMode, new akd0(this, 8));
        this.n = msy.a(lazyThreadSafetyMode, new stg0(this, 2));
        this.o = msy.a(lazyThreadSafetyMode, new fm20(this, 24));
        this.p = new io.reactivex.rxjava3.disposables.b();
        this.r = new xmz(28);
        this.s = new HashSet<>(linkedHashSet);
        HashSet hashSet = new HashSet(linkedHashSet);
        this.t = hashSet;
        rmk0 rmk0Var = new rmk0(2);
        rmk0Var.a(a.a);
        ArrayList arrayList = new ArrayList(c5g.u(hashSet, 10));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(new c((Narrative) it.next()));
        }
        rmk0Var.b(arrayList.toArray(new c[0]));
        ArrayList<Object> arrayList2 = rmk0Var.a;
        this.v = e43.o(arrayList2.toArray(new zif0[arrayList2.size()]));
        io.reactivex.rxjava3.subjects.f<Pair<UserId, d5v>> fVar = ((gu50) this.n.getValue()).a().a;
        p5w p5wVar = new p5w(new fuc0(this, 9), 15);
        fVar.getClass();
        this.p.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, p5wVar).subscribe(new pdw(new bnc0(this, 8), 23)));
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    public static void b(s8i0 s8i0Var, Collection collection, boolean z, Collection collection2, int i) {
        Object obj;
        String str;
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            collection2 = EmptyList.b;
        }
        boolean z2 = (i & 8) != 0;
        ArrayList arrayList = s8i0Var.v;
        StoryEntry storyEntry = s8i0Var.e;
        if (z2) {
            dw20 dw20Var = s8i0Var.u;
            if (dw20Var != null) {
                dw20Var.dismiss();
            }
            s8i0Var.u = null;
        }
        if (z2 && (!collection.isEmpty() || !collection2.isEmpty())) {
            s8i0Var.f.invoke(collection, Boolean.valueOf(z), collection2);
            String g = ((vu50) s8i0Var.l.getValue()).g(collection, collection2, z);
            ikv0.a aVar = new ikv0.a(bwt0.u(s8i0Var.b));
            aVar.u = new ikv0.d(g, (String) null, (ikv0.d.a) null, 6);
            int i2 = StoryBottomViewGroup.P;
            aVar.o = Integer.valueOf(StoryBottomViewGroup.a.a(s8i0Var.k));
            if (collection.size() == 1) {
                Serializer.c<Narrative> cVar = Narrative.CREATOR;
                str = Narrative.a.b((Narrative) j5g.X(collection), cn70.b(24));
            } else {
                str = null;
            }
            if (str == null) {
                str = storyEntry != null ? storyEntry.Ib(cn70.b(24)) : null;
            }
            if (str != null) {
                aVar.t = new ikv0.c.e(new c.d(str, null), null, null, 14);
            }
            Window window = s8i0Var.c;
            if (window != null) {
                aVar.p(window);
            } else {
                aVar.n();
            }
        }
        if (z2) {
            return;
        }
        VKList vKList = new VKList(collection);
        g5g.y(vKList, s8i0Var.h);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            zif0 zif0Var = (zif0) obj;
            if (zif0Var instanceof c) {
                if (!j5g.P(((c) zif0Var).a.l, storyEntry != null ? Integer.valueOf(storyEntry.c) : null)) {
                    break;
                }
            }
        }
        zif0 zif0Var2 = (zif0) obj;
        int indexOf = arrayList.size() > 1 ? zif0Var2 != null ? arrayList.indexOf(zif0Var2) : arrayList.size() : zif0Var2 != null ? arrayList.indexOf(zif0Var2) : 1;
        Iterator<T> it2 = vKList.iterator();
        while (it2.hasNext()) {
            Narrative narrative = (Narrative) it2.next();
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((zif0) it3.next()).a() == narrative.b) {
                        break;
                    }
                }
            }
            arrayList.add(indexOf, new c(narrative));
        }
        s8i0Var.r.invoke(Boolean.valueOf(!epx.f(s8i0Var.s, r10)));
        t8i0 t8i0Var = s8i0Var.x;
        (t8i0Var != null ? t8i0Var : null).setItems(arrayList);
        ba40 ba40Var = s8i0Var.q;
        if (ba40Var != null) {
            ba40Var.invoke(Boolean.valueOf(arrayList.size() <= 1));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(StoryEntry storyEntry) {
        ((su50) this.o.getValue()).c(this.d, this.i, Collections.singletonList(Integer.valueOf(storyEntry.c))).h(this.b, 229);
    }

    public final void c(VKList<Narrative> vKList) {
        ArrayList arrayList = this.v;
        HashSet hashSet = this.t;
        StoryEntry storyEntry = this.e;
        if (storyEntry != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Narrative narrative : vKList) {
                if (narrative.l.contains(Integer.valueOf(storyEntry.c))) {
                    arrayList2.add(narrative);
                }
            }
            g5g.y(arrayList2, hashSet);
            g5g.y(hashSet, this.h);
            ArrayList arrayList3 = new ArrayList(c5g.u(hashSet, 10));
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList3.add(new c((Narrative) it.next()));
            }
            g5g.y(arrayList3, arrayList);
        }
        List t0 = j5g.t0(vKList, hashSet);
        ArrayList arrayList4 = new ArrayList(c5g.u(t0, 10));
        Iterator it2 = t0.iterator();
        while (it2.hasNext()) {
            arrayList4.add(new c((Narrative) it2.next()));
        }
        g5g.y(arrayList4, arrayList);
        t8i0 t8i0Var = this.x;
        if (t8i0Var == null) {
            t8i0Var = null;
        }
        t8i0Var.setItems(arrayList);
        dw20 dw20Var = this.u;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
        l7s u = bwt0.u(this.b);
        int themeResId = u.getThemeResId();
        dhr0.a.getClass();
        if (themeResId != dhr0.u().c) {
            u = new l7s(u, dhr0.u().c);
        }
        uam0.a aVar = new uam0.a(u, null);
        b6f0 b6f0Var = new b6f0(this, 3);
        xsw xswVar = new xsw(this, 29);
        fyd0 fyd0Var = new fyd0(this, 9);
        aVar.j = b6f0Var;
        aVar.k = xswVar;
        aVar.l = fyd0Var;
        t8i0 t8i0Var2 = this.x;
        if (t8i0Var2 == null) {
            t8i0Var2 = null;
        }
        aVar.h = t8i0Var2;
        this.q = new ba40(aVar, 22);
        this.r = new pod0(aVar, 4);
        this.u = aVar.a0(new i8c0(5)).I0(null);
        ba40 ba40Var = this.q;
        if (ba40Var != null) {
            ba40Var.invoke(Boolean.valueOf(arrayList.size() <= 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, android.view.View] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, android.view.View] */
    public final void d(int i) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        d.a aVar = new d.a(bwt0.u(this.b));
        View inflate = LayoutInflater.from(aVar.getContext()).inflate(R.layout.create_highlight_dialog, (ViewGroup) null, false);
        ref$ObjectRef.element = inflate.findViewById(R.id.input_edit_text);
        ref$ObjectRef2.element = inflate.findViewById(R.id.create_button);
        View findViewById = inflate.findViewById(R.id.close_image_view);
        ((TextView) inflate.findViewById(R.id.subtitle_text_view)).setText(i);
        aVar.setView(inflate);
        androidx.appcompat.app.d m = aVar.m();
        View view = (View) ref$ObjectRef2.element;
        view.getBackground().setTint(view.getContext().getColor(R.color.vk_gray_300));
        view.setEnabled(false);
        view.setOnClickListener(new r8i0(this, ref$ObjectRef, m, 0));
        VkInputSelect vkInputSelect = (VkInputSelect) ref$ObjectRef.element;
        vkInputSelect.setFilters(new InputFilter[]{new InputFilter.LengthFilter(23)});
        vkInputSelect.g.addTextChangedListener(new x0v0(new e220(2, ref$ObjectRef2, vkInputSelect)));
        vkInputSelect.post(new ux3(vkInputSelect, 9));
        ((ImageView) findViewById).setOnClickListener(new og8(m, 7));
        Window window = m.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            window.setAttributes(attributes);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(cn70.b(12));
            gradientDrawable.setTint(0);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) gradientDrawable, 0, 0, 0, cn70.b(8)));
        }
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 229 && i2 == -1 && intent != null) {
            Narrative narrative = (Narrative) intent.getParcelableExtra("RESULT_EXTRA_HIGHLIGHT");
            if (narrative != null) {
                b(this, Collections.singletonList(narrative), false, null, 14);
                return;
            }
            dw20 dw20Var = this.u;
            if (dw20Var != null) {
                dw20Var.dismiss();
            }
            this.u = null;
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.NARRATIVE_SELECTION;
    }
}

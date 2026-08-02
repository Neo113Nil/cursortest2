package xsna;

import android.text.Editable;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.EditText;
import com.vk.camera.editor.common.text.views.CreateStoryEditText;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.mention.SelectionChangeEditText;
import com.vk.superapp.api.dto.story.WebStickerType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import xsna.ikv0;

/* compiled from: StorySuggestsDelegate.kt */
/* loaded from: classes16.dex */
public final class tim0 implements f420, l420, ivu, lvu, SelectionChangeEditText.a, io.reactivex.rxjava3.disposables.c {
    public final SelectionChangeEditText b;
    public final k9l0 c;
    public final ArrayList d;
    public final da50 e;
    public final d7l0 f;
    public final evu g;
    public final q420 h;
    public final env i;
    public final g420 j;
    public final HashMap<UserId, String> k;
    public final int l;
    public final int m;
    public final HashSet<UserId> n;
    public final io.reactivex.rxjava3.disposables.c o;
    public int p;
    public int q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StorySuggestsDelegate.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a HASHTAG;
        public static final a MENTION;

        static {
            a aVar = new a("MENTION", 0);
            MENTION = aVar;
            a aVar2 = new a("HASHTAG", 1);
            HASHTAG = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: StorySuggestsDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.MENTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.HASHTAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public tim0(CreateStoryEditText createStoryEditText, k9l0 k9l0Var, ArrayList arrayList, da50 da50Var, bws bwsVar, q520 q520Var, z410 z410Var, n0m0 n0m0Var, d7l0 d7l0Var) {
        this.b = createStoryEditText;
        this.c = k9l0Var;
        this.d = arrayList;
        this.e = da50Var;
        this.f = d7l0Var;
        createStoryEditText.getContext();
        this.g = new evu(createStoryEditText, this, new sa30(), null);
        createStoryEditText.getContext();
        q420 q420Var = new q420(createStoryEditText, this, new w6m0(), null, true);
        q420Var.o = true;
        this.h = q420Var;
        this.i = new w4m0(this);
        this.j = (g420) q520Var.invoke(this);
        this.k = new HashMap<>();
        this.n = new HashSet<>();
        createStoryEditText.addTextChangedListener(q420Var);
        Pattern pattern = n420.a;
        String text = createStoryEditText.getText();
        List<? extends vg6> a2 = n420.a(text == null ? "" : text);
        if (a2 != null) {
            for (vg6 vg6Var : a2) {
                if (vg6Var instanceof pgq0) {
                    this.k.put(((pgq0) vg6Var).d, vg6Var.c);
                }
            }
        }
        k9l0 k9l0Var2 = this.c;
        if (k9l0Var2 != null) {
            int max = Math.max(k9l0Var2.a.size() - this.k.size(), 0);
            int i = this.c.b;
            evu evuVar = this.g;
            EditText editText = evuVar.a;
            int max2 = Math.max(i - editText.getText().getSpans(0, editText.getText().length(), evuVar.c.f()).length, 0);
            this.l = o0m0.d(WebStickerType.MENTION) - max;
            this.m = o0m0.d(WebStickerType.HASHTAG) - max2;
        } else {
            this.l = Integer.MAX_VALUE;
            this.m = Integer.MAX_VALUE;
        }
        g(a2);
        evu evuVar2 = this.g;
        EditText editText2 = evuVar2.a;
        this.q = editText2.getText().getSpans(0, editText2.getText().length(), evuVar2.c.f()).length;
        this.j.c();
        this.b.setSelectionChangeListener(this);
        this.o = new io.reactivex.rxjava3.internal.operators.mixed.o(this.g.h.w0(200L, TimeUnit.MILLISECONDS), new hi70(new gqe0(this, 10), 8)).U(new oe40(new j6e0(13), 11)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new cp50(new k170(this, 26), 18), new zyu(new fo20(25), 25));
    }

    public static final boolean e(tim0 tim0Var, int i, int i2, CharSequence charSequence) {
        SelectionChangeEditText selectionChangeEditText = tim0Var.b;
        if (charSequence.length() + (selectionChangeEditText.length() - (i2 - i)) <= -1) {
            return false;
        }
        ikv0.a aVar = new ikv0.a(selectionChangeEditText.getContext());
        aVar.t = new ikv0.c.C3058c(R.drawable.ic_cross_in_red_circle, (Integer) null, (Size) null, 14);
        aVar.u = new ikv0.d(y8g0.f(R.string.story_max_length_error, String.valueOf(-1)), (String) null, (ikv0.d.a) null, 6);
        aVar.n();
        tim0Var.i.hide();
        tim0Var.Y0();
        return true;
    }

    @Override // xsna.f420
    public final void D0(b420 b420Var) {
        UserId userId = b420Var.a;
        String str = (String) this.f.invoke(b420Var);
        if (this.p < this.l) {
            SelectionChangeEditText selectionChangeEditText = this.b;
            selectionChangeEditText.setSelectionChangeListener(null);
            this.h.Q(userId, str, true);
            selectionChangeEditText.setSelectionChangeListener(this);
            this.j.hide();
            this.k.put(userId, str);
            g(null);
        }
    }

    @Override // xsna.l420
    public final void Y0() {
        this.j.hide();
    }

    @Override // com.vk.dto.stories.model.mention.SelectionChangeEditText.a
    public final void b(int i, int i2) {
        if (i != i2) {
            return;
        }
        this.h.d(i);
        this.g.e(i);
    }

    @Override // xsna.ivu
    public final void c(String str) {
        int i = this.q;
        int i2 = this.m;
        SelectionChangeEditText selectionChangeEditText = this.b;
        if (i < i2) {
            selectionChangeEditText.setSelectionChangeListener(null);
            evu evuVar = this.g;
            evuVar.a(null, null, str);
            selectionChangeEditText.setSelectionChangeListener(this);
            EditText editText = evuVar.a;
            this.q = editText.getText().getSpans(0, editText.getText().length(), evuVar.c.f()).length;
        }
        Editable text = selectionChangeEditText.getText();
        if (text != null) {
            text.insert(text.length(), " ");
        }
    }

    @Override // xsna.lvu
    public final void d(qux0 qux0Var, qux0 qux0Var2) {
        SelectionChangeEditText selectionChangeEditText = this.b;
        CharSequence text = selectionChangeEditText.getText();
        if (text == null) {
            text = "";
        }
        if (qux0Var != null) {
            int i = qux0Var.b;
            int i2 = qux0Var.a;
            if ((qux0Var2 == null || i2 != qux0Var2.a) && i <= text.length()) {
                CharSequence subSequence = text.subSequence(i2, i);
                evu evuVar = this.g;
                if (evuVar.d(subSequence)) {
                    String obj = subSequence.toString();
                    Integer valueOf = Integer.valueOf(i2);
                    Integer valueOf2 = Integer.valueOf(i);
                    if (this.q < this.m) {
                        selectionChangeEditText.setSelectionChangeListener(null);
                        evuVar.a(valueOf, valueOf2, obj);
                        selectionChangeEditText.setSelectionChangeListener(this);
                        EditText editText = evuVar.a;
                        this.q = editText.getText().getSpans(0, editText.getText().length(), evuVar.c.f()).length;
                    }
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        this.j.onDestroyView();
        io.reactivex.rxjava3.disposables.c cVar = this.o;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    public final void f(a aVar) {
        int i = b.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i == 1) {
            this.i.hide();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.j.hide();
        }
    }

    public final void g(List<? extends vg6> list) {
        Set C;
        if (list == null) {
            Pattern pattern = n420.a;
            CharSequence text = this.b.getText();
            if (text == null) {
                text = "";
            }
            list = n420.a(text);
        }
        HashSet<UserId> hashSet = this.n;
        int size = hashSet.size();
        if (list != null && (C = rli0.C(new ulp0(rli0.j(new i5g(list), new k220(29)), new epj0(3)))) != null) {
            Iterator it = C.iterator();
            while (it.hasNext()) {
                if (!hashSet.contains((UserId) it.next())) {
                    size++;
                }
            }
        }
        this.p = size;
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        io.reactivex.rxjava3.disposables.c cVar = this.o;
        return cVar != null && cVar.h();
    }

    @Override // xsna.l420
    public final void x0(String str) {
        if (str.length() == 0) {
            g(null);
        }
        int i = this.p;
        int i2 = this.l;
        g420 g420Var = this.j;
        if (i < i2) {
            f(a.MENTION);
            g420Var.j(str);
            return;
        }
        SelectionChangeEditText selectionChangeEditText = this.b;
        ikv0.a aVar = new ikv0.a(selectionChangeEditText.getContext());
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
        aVar.u = new ikv0.d(selectionChangeEditText.getContext().getString(R.string.sticker_mention_limit), (String) null, (ikv0.d.a) null, 6);
        aVar.l = 80;
        int i3 = ify.a;
        aVar.o = Integer.valueOf(ify.d(2, 0));
        aVar.o((ViewGroup) bwt0.A(selectionChangeEditText)).c();
        g420Var.hide();
    }

    @Override // xsna.f420
    public final void S1() {
    }

    @Override // xsna.f420
    public final void e0() {
    }

    @Override // xsna.l420
    public final void N3(UserId userId) {
    }

    @Override // xsna.f420
    public final void s5(Attachment attachment) {
    }

    @Override // xsna.f420
    public final void v5(Throwable th) {
    }

    @Override // xsna.f420
    public final void x4(boolean z) {
    }
}

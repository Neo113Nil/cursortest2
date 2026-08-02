package xsna;

import android.text.Editable;
import android.text.SpannableString;
import android.widget.EditText;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: MentionsEditTextHelper.kt */
/* loaded from: classes3.dex */
public final class q420 implements q320 {
    public final EditText b;
    public final l420 c;
    public final wn4 d;
    public final yzs<Integer, Integer, CharSequence, Boolean> e;
    public final boolean f;
    public o320 g;
    public final fvr h;
    public Integer i;
    public int j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public x420 p;
    public w420 q;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        public final /* synthetic */ Editable b;

        public a(Editable editable) {
            this.b = editable;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Editable editable = this.b;
            return jw5.b(Integer.valueOf(editable.getSpanStart((i420) t2)), Integer.valueOf(editable.getSpanStart((i420) t)));
        }
    }

    public q420(EditText editText, l420 l420Var, wn4 wn4Var, uim0 uim0Var, boolean z) {
        this.b = editText;
        this.c = l420Var;
        this.d = wn4Var;
        this.e = uim0Var;
        this.f = z;
        this.g = new x1o0();
        this.h = new fvr();
        this.j = -1;
        this.k = true;
        this.p = new wwf0();
        this.q = new qxm0();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    @Override // xsna.q320
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(UserId userId, String str, boolean z) {
        int g;
        int max;
        boolean z2;
        Editable editableText;
        i420[] i420VarArr;
        EditText editText = this.b;
        String obj = editText.getText().toString();
        int selectionEnd = editText.getSelectionEnd();
        boolean z3 = true;
        if (obj.length() == 0) {
            max = 0;
        } else {
            if (selectionEnd >= 0 && selectionEnd < obj.length()) {
                g = yjo0.g(selectionEnd, obj);
            } else if (this.o && obj.length() > 0 && selectionEnd == obj.length()) {
                g = yjo0.g(selectionEnd - 1, obj);
            } else {
                int length = obj.length();
                int i = this.j;
                if (i < 0 || i >= length) {
                    Pattern pattern = yjo0.a;
                    g = yjo0.g(obj.length() - 1, obj);
                } else {
                    g = i;
                }
            }
            max = Math.max(0, g);
        }
        Pattern pattern2 = yjo0.a;
        int length2 = obj.length();
        HashSet<Character> hashSet = yjo0.q;
        int i2 = (selectionEnd < 0 || selectionEnd > length2) ? length2 - 1 : selectionEnd;
        if (max != -1) {
            int i3 = max;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                if (hashSet.contains(Character.valueOf(obj.charAt(i3)))) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
        }
        if (max >= 1) {
            int i4 = max - 1;
            if (obj.charAt(i4) == ' ' || obj.charAt(i4) == '\n') {
                z2 = true;
                if (selectionEnd > 0 && obj.length() > selectionEnd) {
                    obj.charAt(selectionEnd);
                }
                int i5 = (!z2 || max <= 0) ? 0 : 1;
                editableText = editText.getEditableText();
                wn4 wn4Var = this.d;
                if (editableText == null) {
                    wn4Var.getClass();
                    i420VarArr = (i420[]) editableText.getSpans(max, i2, i420.class);
                } else {
                    i420VarArr = null;
                }
                if (c(max, i2) && !z) {
                    z3 = false;
                }
                if (max <= i2 || !z3) {
                }
                i420 j = wn4Var.j(userId);
                j.o1(drm0.E(str, ' '));
                try {
                    Editable editableText2 = editText.getEditableText();
                    if (editableText2 != null) {
                        if (i420VarArr != null) {
                            for (i420 i420Var : i420VarArr) {
                                editableText2.removeSpan(i420Var);
                            }
                        }
                        SpannableString spannableString = new SpannableString((i5 != 0 ? " " : "") + str);
                        spannableString.setSpan(j, i5, str.length() + i5, 33);
                        yzs<Integer, Integer, CharSequence, Boolean> yzsVar = this.e;
                        if (yzsVar != null ? yzsVar.invoke(Integer.valueOf(max), Integer.valueOf(i2), spannableString).booleanValue() : false) {
                            return;
                        }
                        editableText2.replace(max, i2, spannableString);
                        editableText2.insert(max + spannableString.length(), " ");
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
        }
        z2 = false;
        if (selectionEnd > 0) {
            obj.charAt(selectionEnd);
        }
        if (z2) {
        }
        editableText = editText.getEditableText();
        wn4 wn4Var2 = this.d;
        if (editableText == null) {
        }
        if (c(max, i2)) {
            z3 = false;
        }
        if (max <= i2) {
        }
    }

    public final UserId a(int i) {
        UserId userId;
        Editable editableText = this.b.getEditableText();
        if (editableText != null) {
            this.d.getClass();
            i420[] i420VarArr = (i420[]) editableText.getSpans(i, i, i420.class);
            if (i420VarArr != null) {
                ogq0 ogq0Var = null;
                if (i420VarArr.length != 0) {
                    i420 i420Var = i420VarArr[0];
                    if (i420Var instanceof ogq0) {
                        ogq0Var = (ogq0) i420Var;
                    }
                }
                return (ogq0Var == null || (userId = ogq0Var.b) == null) ? UserId.d : userId;
            }
        }
        return UserId.d;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ArrayList arrayList;
        i420 h;
        if (editable == null || !this.m) {
            return;
        }
        if (this.n) {
            this.n = false;
            return;
        }
        ArrayList m = yjo0.m(editable);
        if (m != null) {
            arrayList = new ArrayList(c5g.u(m, 10));
            Iterator it = m.iterator();
            while (it.hasNext()) {
                arrayList.add(this.p.b((vg6) it.next(), editable));
            }
        } else {
            arrayList = null;
        }
        wn4 wn4Var = this.d;
        if (arrayList != null) {
            int i = 0;
            for (vg6 vg6Var : j5g.D0(new r420(0), arrayList)) {
                int i2 = vg6Var.a;
                int i3 = vg6Var.b;
                int i4 = i2 - i;
                int i5 = i3 - i;
                if (i4 >= 0 && i4 <= editable.length() && i5 >= 0 && i5 <= editable.length()) {
                    this.n = true;
                    String g = this.q.g(vg6Var);
                    editable.replace(i4, i5, g);
                    i += (i3 - vg6Var.a) - g.length();
                    Integer k = wn4Var.k();
                    if (!(vg6Var instanceof ei7) || k == null) {
                        h = wn4Var.h(vg6Var);
                    } else {
                        ei7 ei7Var = (ei7) vg6Var;
                        h = new fi7(ei7Var.d, k.intValue(), ei7Var.f, ei7Var.g);
                    }
                    if (drm0.E(vg6Var.c, ' ') && h != null) {
                        h.o1(true);
                    }
                    editable.setSpan(h, i4, g.length() + i4, 33);
                }
            }
        }
        EditText editText = this.b;
        String obj = editText.getText().toString();
        Pattern pattern = yjo0.a;
        int e = yjo0.e(editText.getSelectionEnd(), obj);
        Integer num = this.i;
        if (num == null || num.intValue() != e) {
            this.c.getClass();
            this.i = Integer.valueOf(e);
        }
        int d = yjo0.d(editText.getSelectionEnd(), editText.getText().toString());
        wn4Var.getClass();
        Object[] objArr = (i420[]) editable.getSpans(e, d, i420.class);
        if (objArr == null || objArr.length == 0) {
            return;
        }
        if (objArr.length != 1) {
            if (objArr.length > 1) {
                for (Object obj2 : objArr) {
                    editable.removeSpan(obj2);
                }
                return;
            }
            return;
        }
        Object obj3 = objArr[0];
        int spanStart = editable.getSpanStart(obj3);
        int spanEnd = editable.getSpanEnd(obj3);
        if (e < spanStart || spanEnd < d) {
            editable.removeSpan(obj3);
            int i6 = spanStart - 1;
            k9x k9xVar = new k9x(i6, spanEnd, 1);
            int i7 = this.l;
            if (i6 > i7 || i7 > k9xVar.c) {
                return;
            }
            if (e >= spanStart) {
                e = spanStart;
            }
            if (spanEnd >= d) {
                d = spanEnd;
            }
            editable.setSpan(obj3, e, d, 33);
        }
    }

    public final String b() {
        EditText editText = this.b;
        String obj = editText.getText().toString();
        Editable editableText = editText.getEditableText();
        if (editableText == null) {
            return obj;
        }
        int length = obj.length();
        this.d.getClass();
        List<i420> m0 = rl3.m0(editableText.getSpans(0, length, i420.class), new a(editableText));
        StringBuilder sb = new StringBuilder(obj);
        for (i420 i420Var : m0) {
            int spanStart = editableText.getSpanStart(i420Var);
            int spanEnd = editableText.getSpanEnd(i420Var);
            String obj2 = editableText.subSequence(spanStart, spanEnd).toString();
            sb.replace(spanStart, spanEnd, i420Var instanceof fi7 ? this.h.d(i420Var, obj2) : this.g.d(i420Var, obj2));
        }
        return this.f ? brm0.y(sb.toString(), "\n", " ") : sb.toString();
    }

    public final boolean c(int i, int i2) {
        Editable editableText = this.b.getEditableText();
        if (editableText == null) {
            return false;
        }
        this.d.getClass();
        i420[] i420VarArr = (i420[]) editableText.getSpans(i, i2, i420.class);
        return (i420VarArr == null || i420VarArr.length == 0) ? false : true;
    }

    public final void d(int i) {
        String str;
        this.l = i;
        String obj = this.b.getText().toString();
        int e = yjo0.e(i, obj);
        Integer num = this.i;
        l420 l420Var = this.c;
        if (num == null || num.intValue() != e) {
            l420Var.getClass();
            this.i = Integer.valueOf(e);
        }
        Character z0 = erm0.z0(e, obj);
        if (yjo0.p(z0 != null ? z0.charValue() : ' ') && e < i) {
            try {
                str = obj.substring(e + 1, yjo0.d(i, obj));
            } catch (IndexOutOfBoundsException unused) {
                str = "";
            }
            l420Var.x0(str);
        } else {
            l420Var.Y0();
            UserId a2 = a(i);
            if (fkq0.c(a2)) {
                l420Var.N3(a2);
            }
        }
    }

    public final void e(boolean z) {
        if (this.m == z) {
            return;
        }
        this.m = z;
        if (z) {
            afterTextChanged(this.b.getText());
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.k = charSequence == null || charSequence.length() == 0;
        l420 l420Var = this.c;
        if (charSequence == null || charSequence.length() == 0) {
            l420Var.Y0();
            return;
        }
        EditText editText = this.b;
        String obj = editText.getText().toString();
        int length = this.k ? obj.length() : editText.getSelectionEnd();
        int g = yjo0.g(length - 1, obj);
        this.j = g;
        if (g < 0) {
            l420Var.Y0();
            return;
        }
        if (c(g <= 0 ? g : g - 1, g + 2 < charSequence.length() ? this.j + 2 : this.j)) {
            return;
        }
        String substring = obj.substring(this.j + 1, length);
        for (int i4 = 0; i4 < substring.length(); i4++) {
            if (ro.j(substring.charAt(i4))) {
                return;
            }
        }
        l420Var.x0(substring);
    }

    public /* synthetic */ q420(EditText editText, l420 l420Var, wn4 wn4Var, int i) {
        this(editText, l420Var, (i & 4) != 0 ? new pil(editText.getContext()) : wn4Var, null, false);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}

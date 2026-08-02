package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.VkLinkedTextView;
import com.vk.superapp.api.dto.identity.WebIdentityCard;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.bt9;
import xsna.j2v0;

/* compiled from: IdentityListAdapter.kt */
/* loaded from: classes6.dex */
public final class kvv extends zoj0<vuv, RecyclerView.e0> implements mf7, bt9.a {
    public final FunctionReferenceImpl e;
    public final FunctionReferenceImpl f;
    public final bt9 g = new bt9(this);

    /* compiled from: IdentityListAdapter.kt */
    public final class a extends RecyclerView.e0 {
    }

    /* compiled from: IdentityListAdapter.kt */
    public static final class b extends RecyclerView.e0 {

        /* compiled from: IdentityListAdapter.kt */
        public final class a {
            public a() {
            }
        }
    }

    /* compiled from: IdentityListAdapter.kt */
    public final class c extends RecyclerView.e0 {
        public final TextView l;
        public final TextView m;

        public c(kvv kvvVar, View view) {
            super(view);
            this.l = (TextView) view.findViewById(R.id.title);
            this.m = (TextView) view.findViewById(R.id.subtitle);
            jjc.g(view, new ut6(17, kvvVar, this));
        }
    }

    /* compiled from: IdentityListAdapter.kt */
    public static final class d extends RecyclerView.e0 {
    }

    /* compiled from: IdentityListAdapter.kt */
    public static final class e extends RecyclerView.e0 {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kvv(izs<? super String, s3q0> izsVar, izs<? super WebIdentityCard, s3q0> izsVar2) {
        this.e = (FunctionReferenceImpl) izsVar;
        this.f = (FunctionReferenceImpl) izsVar2;
    }

    @Override // xsna.bt9.a
    public final boolean F(int i) {
        return getItemViewType(i) == 0;
    }

    @Override // xsna.mf7
    public final int e0(int i) {
        return this.g.e0(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((vuv) ((ArrayList) y0()).get(i)).a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        String string;
        String string2;
        vuv vuvVar = (vuv) ((ArrayList) y0()).get(i);
        if (e0Var instanceof a) {
            View view = ((a) e0Var).itemView;
            TextView textView = (TextView) view;
            Context context = view.getContext();
            String str = ((xuv) vuvVar).b;
            int hashCode = str.hashCode();
            if (hashCode == -1147692044) {
                if (str.equals(RTCStatsConstants.KEY_ADDRESS)) {
                    string2 = context.getString(R.string.vk_identity_add_address);
                    textView.setText(string2);
                    return;
                }
                throw new IllegalStateException(str.concat(" not supported"));
            }
            if (hashCode == 96619420) {
                if (str.equals("email")) {
                    string2 = context.getString(R.string.vk_identity_add_email);
                    textView.setText(string2);
                    return;
                }
                throw new IllegalStateException(str.concat(" not supported"));
            }
            if (hashCode == 106642798 && str.equals("phone")) {
                string2 = context.getString(R.string.vk_identity_add_phone);
                textView.setText(string2);
                return;
            }
            throw new IllegalStateException(str.concat(" not supported"));
        }
        if (e0Var instanceof e) {
            ((TextView) ((e) e0Var).itemView).setText(((bvv) vuvVar).b.toUpperCase(Locale.ROOT));
            return;
        }
        if (e0Var instanceof c) {
            c cVar = (c) e0Var;
            TextView textView2 = cVar.l;
            WebIdentityCard webIdentityCard = ((yuv) vuvVar).b;
            textView2.setText(webIdentityCard.getTitle());
            cVar.m.setText(webIdentityCard.Cb());
            return;
        }
        if (e0Var instanceof d) {
            d dVar = (d) e0Var;
            String str2 = ((cvv) vuvVar).b;
            View view2 = dVar.itemView;
            TextView textView3 = (TextView) view2;
            Context context2 = view2.getContext();
            Context context3 = dVar.itemView.getContext();
            int hashCode2 = str2.hashCode();
            if (hashCode2 == -1147692044) {
                if (str2.equals(RTCStatsConstants.KEY_ADDRESS)) {
                    string = context3.getString(R.string.vk_identity_address_dat);
                    textView3.setText(context2.getString(R.string.vk_identity_limit_text, string.toLowerCase(Locale.ROOT)));
                    return;
                }
                throw new IllegalStateException(str2.concat(" not supported"));
            }
            if (hashCode2 == 96619420) {
                if (str2.equals("email")) {
                    string = context3.getString(R.string.vk_identity_email_dat);
                    textView3.setText(context2.getString(R.string.vk_identity_limit_text, string.toLowerCase(Locale.ROOT)));
                    return;
                }
                throw new IllegalStateException(str2.concat(" not supported"));
            }
            if (hashCode2 == 106642798 && str2.equals("phone")) {
                string = context3.getString(R.string.vk_identity_phone_dat);
                textView3.setText(context2.getString(R.string.vk_identity_limit_text, string.toLowerCase(Locale.ROOT)));
                return;
            }
            throw new IllegalStateException(str2.concat(" not supported"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v11, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v12, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v15, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v16, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        b bVar;
        if (i == 0) {
            int i3 = iop0.b;
            return new hop0(new iop0(viewGroup.getContext()));
        }
        int i4 = 1;
        if (i == 4) {
            d dVar = new d(new TextView(viewGroup.getContext()));
            TextView textView = (TextView) dVar.itemView;
            float f = 16;
            textView.setPadding(iah0.a(f), iah0.a(f), iah0.a(f), iah0.a(f));
            krv0.q(textView, R.attr.vk_ui_text_secondary);
            textView.setTextSize(1, 14.0f);
            return dVar;
        }
        if (i == R.layout.vk_holder_header) {
            TextView textView2 = new TextView(viewGroup.getContext());
            textView2.setTextColor(viewGroup.getContext().getColor(R.color.vk_gray_400));
            float f2 = 16;
            textView2.setPadding(iah0.a(f2), 0, iah0.a(f2), 0);
            textView2.setSingleLine();
            textView2.setGravity(16);
            textView2.setMaxLines(1);
            textView2.setLines(1);
            com.vk.typography.b.k(textView2, FontFamily.MEDIUM, Float.valueOf(14.0f), 4);
            textView2.setLayoutParams(new RecyclerView.p(-1, iah0.a(42)));
            return new e(textView2);
        }
        View b2 = tf3.b(viewGroup, i, viewGroup, false);
        ?? r6 = 0;
        if (i == R.layout.vk_material_list_button_blue) {
            a aVar = new a(b2);
            TextView textView3 = (TextView) aVar.itemView;
            com.vk.typography.b.k(textView3, FontFamily.REGULAR, null, 6);
            jjc.g(textView3, new com.vk.movika.sdk.base.ui.s0(14, this, aVar));
            float f3 = 16;
            textView3.setPadding(iah0.a(f3), 0, iah0.a(f3), iah0.a(1));
            return aVar;
        }
        if (i == R.layout.vk_identity_item) {
            return new c(this, b2);
        }
        if (i != R.layout.vk_identity_desc) {
            throw new IllegalStateException("unsupported this viewType");
        }
        b bVar2 = new b(b2);
        VkLinkedTextView vkLinkedTextView = (VkLinkedTextView) bVar2.itemView.findViewById(R.id.identity_desc_text);
        ArrayList a2 = e43.a("vk.com", "vk.ru");
        if (!a2.contains(a0a.d)) {
            a2.add(a0a.d);
        }
        j2v0 j2v0Var = new j2v0(a2);
        Context context = bVar2.itemView.getContext();
        String string = bVar2.itemView.getContext().getString(R.string.vk_identity_desc);
        b.a aVar2 = bVar2.new a();
        ArrayList<String> arrayList = j2v0Var.a;
        if (string == null) {
            string = "";
            bVar = bVar2;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Matcher matcher = j2v0.d.matcher(string);
            int i5 = 0;
            while (true) {
                i2 = 2;
                if (!matcher.find()) {
                    break;
                }
                if (!j2v0.a(matcher, arrayList2, i5)) {
                    if (r6 == 0) {
                        r6 = new SpannableStringBuilder(string);
                    }
                    String group = matcher.group(2);
                    int start = matcher.start() - i5;
                    int end = matcher.end() - i5;
                    int length = group.length() + start;
                    int i6 = end - length;
                    b bVar3 = bVar2;
                    k2v0 k2v0Var = new k2v0(arrayList, matcher.group(i4), aVar2);
                    k2v0Var.e = Integer.valueOf(krv0.m(R.attr.vk_ui_text_link, context));
                    Matcher matcher2 = matcher;
                    Typeface a3 = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, context);
                    TextSizeUnit textSizeUnit = TextSizeUnit.SP;
                    k2v0Var.f = a3;
                    r6 = r6.replace(start, end, group);
                    r6.setSpan(k2v0Var, start, length, 0);
                    j2v0.b(arrayList2, start, i6);
                    arrayList2.add(new j2v0.a(start, length));
                    i5 += i6;
                    bVar2 = bVar3;
                    matcher = matcher2;
                    i4 = 1;
                }
            }
            bVar = bVar2;
            Matcher matcher3 = j2v0.c.matcher(r6 == 0 ? string : r6);
            int i7 = 0;
            while (matcher3.find()) {
                if (!j2v0.a(matcher3, arrayList2, i7)) {
                    if (r6 == 0) {
                        r6 = new SpannableStringBuilder(string);
                    }
                    String group2 = matcher3.group(i2);
                    int start2 = matcher3.start() - i7;
                    int end2 = matcher3.end() - i7;
                    int length2 = group2.length() + start2;
                    int i8 = end2 - length2;
                    k2v0 k2v0Var2 = new k2v0(arrayList, matcher3.group(1), aVar2);
                    k2v0Var2.e = Integer.valueOf(krv0.m(R.attr.vk_ui_text_link, context));
                    r6 = r6.replace(start2, end2, group2);
                    r6.setSpan(k2v0Var2, start2, length2, 0);
                    j2v0.b(arrayList2, start2, i8);
                    arrayList2.add(new j2v0.a(start2, length2));
                    i7 += i8;
                    i2 = 2;
                }
            }
            Matcher matcher4 = j2v0.b.matcher(r6 == 0 ? string : r6);
            int i9 = 0;
            while (matcher4.find()) {
                if (!j2v0.a(matcher4, arrayList2, i9)) {
                    if (r6 == 0) {
                        r6 = new SpannableStringBuilder(string);
                    }
                    StyleSpan styleSpan = new StyleSpan(1);
                    String group3 = matcher4.group(1);
                    int start3 = matcher4.start() - i9;
                    int end3 = matcher4.end() - i9;
                    int length3 = group3.length() + start3;
                    int i10 = end3 - length3;
                    r6 = r6.replace(start3, end3, group3);
                    r6.setSpan(styleSpan, start3, length3, 0);
                    j2v0.b(arrayList2, start3, i10);
                    arrayList2.add(new j2v0.a(start3, length3));
                    i9 += i10;
                }
            }
            if (r6 != 0) {
                string = r6;
            }
        }
        vkLinkedTextView.setText(string);
        return bVar;
    }
}

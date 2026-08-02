package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.formatters.spans.dialogitem.MsgBodySpan;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.Regex;

/* compiled from: MsgSearchFormatter.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes2.dex */
public final class lx30 {
    public static final lx30 a;
    public static final /* synthetic */ qcy<Object>[] b;
    public static final wqo0 c;
    public static final com.vk.im.ui.formatters.a d;
    public static final en30 e;
    public static final x040 f;
    public static final hdp g;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(lx30.class, "builder", "getBuilder()Landroid/text/SpannableStringBuilder;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
        a = new lx30();
        c = new wqo0(new xu0(22));
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        d = new com.vk.im.ui.formatters.a(context);
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        e = new en30(context2);
        Context context3 = e43.a;
        f = new x040(context3 != null ? context3 : null);
        g = hdp.a;
    }

    public static Pair a(MsgFromUser msgFromUser, Peer peer, boolean z, ProfilesSimpleInfo profilesSimpleInfo, ArrayList arrayList) {
        CharSequence charSequence;
        Pair pair;
        String str;
        String H5;
        ArrayList s = up2.s(arrayList);
        mx30.a.getClass();
        com.vk.im.engine.models.messages.a a2 = mx30.a(msgFromUser, s, profilesSimpleInfo, 0);
        if (a2 == null) {
            a2 = msgFromUser;
        }
        String str2 = "";
        if (a2.getBody().length() > 0) {
            charSequence = ine0.q(a2.getBody());
        } else if (msgFromUser.da()) {
            x040 x040Var = f;
            x040Var.getClass();
            charSequence = x040Var.a(Collections.singletonList(msgFromUser), profilesSimpleInfo, peer);
        } else {
            charSequence = "";
        }
        b().clear();
        b().append(g.a(new Regex("\n").g(charSequence, " ")));
        SpannableStringBuilder b2 = b();
        mx30.c(b2, arrayList, s);
        if (b2.length() == 0 && msgFromUser.g8()) {
            b2.append(d.b(msgFromUser));
        }
        int length = b2.length();
        en30 en30Var = e;
        if (length == 0 && msgFromUser.p3()) {
            b2.append((CharSequence) en30Var.b(msgFromUser, NestedMsg.Type.REPLY));
        }
        if (b2.length() == 0 && msgFromUser.db()) {
            b2.append((CharSequence) en30Var.b(msgFromUser, NestedMsg.Type.FWD));
        }
        if (z) {
            dhr0.a.getClass();
            Context E = dhr0.E();
            if (msgFromUser.c != peer.b) {
                if (epx.f(a2.getFrom(), peer)) {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    pair = new Pair(context.getString(R.string.vkim_search_me), "");
                } else {
                    qtd0 zb = profilesSimpleInfo.zb(a2.getFrom());
                    if (zb == null || (str = zb.d6(UserNameCase.NOM)) == null) {
                        str = "";
                    }
                    qtd0 zb2 = profilesSimpleInfo.zb(a2.getFrom());
                    if (zb2 != null && (H5 = zb2.H5(UserNameCase.NOM)) != null) {
                        str2 = H5;
                    }
                    pair = new Pair(str, str2);
                }
                if (((CharSequence) pair.i()).length() != 0) {
                    int length2 = b2.length();
                    b2.insert(0, (CharSequence) E.getResources().getString(R.string.vkim_colon));
                    if (((CharSequence) pair.j()).length() > 0) {
                        b2.insert(0, (CharSequence) ".");
                        b2.insert(0, ((String) pair.j()).subSequence(0, 1));
                    }
                    b2.insert(0, (CharSequence) " ");
                    b2.insert(0, (CharSequence) pair.i());
                    com.vk.im.ui.formatters.spans.dialogitem.b.a(b2, MsgBodySpan.Type.MEMBER_NAME, b2.length() - length2, 8);
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str3 = (String) it.next();
                        int K = drm0.K(0, 2, b2, str3, true);
                        if (K >= 0 && str3.length() > 2) {
                            int length3 = str3.length() + K;
                            SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
                            b2.setSpan(new BackgroundColorSpan(676498380), K, length3, 33);
                            break;
                        }
                    }
                }
            }
        }
        SparseArray<ForegroundColorSpan> sparseArray2 = nik0.a;
        return new Pair(a2, new SpannableString(b2));
    }

    public static SpannableStringBuilder b() {
        qcy<Object> qcyVar = b[0];
        wqo0 wqo0Var = c;
        wqo0Var.getClass();
        return (SpannableStringBuilder) wqo0Var.get();
    }
}

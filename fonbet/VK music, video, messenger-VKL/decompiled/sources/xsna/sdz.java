package xsna;

import android.content.Context;
import android.text.Editable;
import android.text.Spannable;
import com.vk.common.links.LinksParserData;
import java.util.ArrayList;
import java.util.regex.MatchResult;

/* compiled from: LinksParser.kt */
/* loaded from: classes17.dex */
public interface sdz {
    CharSequence d(CharSequence charSequence, LinksParserData linksParserData);

    boolean e(String str);

    CharSequence f(CharSequence charSequence, float f);

    boolean g(CharSequence charSequence);

    CharSequence h(CharSequence charSequence);

    CharSequence i(CharSequence charSequence, uij0 uij0Var, float f);

    boolean j(MatchResult matchResult, ArrayList<wlb> arrayList, int i);

    String k(CharSequence charSequence);

    CharSequence l(CharSequence charSequence, uij0 uij0Var, i68 i68Var);

    CharSequence m(CharSequence charSequence);

    boolean n(String str);

    CharSequence o(CharSequence charSequence, LinksParserData linksParserData, vdz vdzVar);

    String p(Context context, uij0 uij0Var);

    Spannable q(Editable editable, LinksParserData linksParserData, ArrayList arrayList);
}

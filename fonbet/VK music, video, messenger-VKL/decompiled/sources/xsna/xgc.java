package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.api.generated.market.dto.MarketSuggestionDto;
import com.vkontakte.android.R;

/* compiled from: ClassifiedsGeoSuggestionHolder.kt */
/* loaded from: classes18.dex */
public final class xgc extends hf6<ygc> {
    public final rgc m;
    public final View n;
    public final TextView o;
    public final TextView p;
    public final View q;

    public xgc(View view, rgc rgcVar) {
        super(view);
        this.m = rgcVar;
        this.n = view.findViewById(R.id.classified_geo_suggestion_root_view);
        this.o = (TextView) view.findViewById(R.id.classified_geo_suggestion_title_tv);
        this.p = (TextView) view.findViewById(R.id.classified_geo_suggestion_subtitle_tv);
        this.q = view.findViewById(R.id.classified_geo_default_iv);
    }

    @Override // xsna.hf6
    public final void W5(ygc ygcVar) {
        ygc ygcVar2 = ygcVar;
        boolean z = ygcVar2.b;
        MarketSuggestionDto marketSuggestionDto = ygcVar2.a;
        View view = this.itemView;
        String str = ygcVar2.c;
        if (str == null) {
            str = "";
        }
        view.setTag("market_geo_suggestion".concat(str));
        int length = marketSuggestionDto.e().length();
        View view2 = this.n;
        TextView textView = this.p;
        TextView textView2 = this.o;
        if (length == 0) {
            bwt0.c0(cn70.b(48), view2);
            ey2.i(textView2, marketSuggestionDto.d());
            f4m.t(cn70.b(0), textView2);
            f4m.m(16, textView2);
            bwt0.p0(textView, false);
        } else {
            bwt0.c0(cn70.b(60), view2);
            ey2.i(textView2, marketSuggestionDto.e());
            f4m.t(cn70.b(11), textView2);
            f4m.m(0, textView2);
            bwt0.p0(textView, true);
            ey2.i(textView, marketSuggestionDto.d());
        }
        bwt0.p0(this.q, z);
        if (z) {
            return;
        }
        jjc.g(this.itemView, new l22(5, marketSuggestionDto, this));
    }
}

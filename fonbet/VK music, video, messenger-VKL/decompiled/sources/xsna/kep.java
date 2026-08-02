package xsna;

import android.content.Context;
import android.view.View;
import com.vk.emoji.RecyclerAutofitGridView;
import com.vkontakte.android.R;
import xsna.bpg0;

/* compiled from: EmojiVariantsPickerView.kt */
/* loaded from: classes18.dex */
public final class kep extends bpg0 {
    public final RecyclerAutofitGridView b;
    public jep c;
    public String[][] d;
    public sdp e;
    public final v7x f;
    public int g;

    public kep(Context context) {
        super(context, null, 0);
        setOutlineProvider(new bpg0.a(context.getResources().getDisplayMetrics().density * 4));
        this.d = new String[0][];
        this.f = new v7x(this, 2);
        View.inflate(context, R.layout.vk_emoji_variants_picker_view, this);
        this.b = (RecyclerAutofitGridView) findViewById(R.id.emoji_variants_picker_ragv);
    }

    public final int getColumnsCount() {
        return this.g;
    }

    public final int getPadding() {
        return (int) getResources().getDimension(R.dimen.vk_emoji_variants_picker_view_padding);
    }

    public final int getRowsCount() {
        return this.d.length;
    }

    public final void setListener(sdp sdpVar) {
        this.e = sdpVar;
    }
}

package xsna;

import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.vk.stickers.settings.StickerSettingsCheckItem;
import com.vkontakte.android.R;

/* compiled from: StickerSettingsCheckHolder.kt */
/* loaded from: classes6.dex */
public final class i6l0 extends qf6 {
    public static final /* synthetic */ int p = 0;
    public final wzs<StickerSettingsCheckItem.Setting, Boolean, s3q0> l;
    public final TextView m;
    public final TextView n;
    public final SwitchCompat o;

    /* JADX WARN: Multi-variable type inference failed */
    public i6l0(ViewGroup viewGroup, wzs<? super StickerSettingsCheckItem.Setting, ? super Boolean, s3q0> wzsVar) {
        super(R.layout.sticker_settings_check_item, viewGroup);
        this.l = wzsVar;
        this.m = (TextView) this.itemView.findViewById(R.id.title);
        this.n = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.o = (SwitchCompat) this.itemView.findViewById(R.id.checkbox);
        jjc.g(this.itemView, new rtg0(this, 5));
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        final StickerSettingsCheckItem stickerSettingsCheckItem = (StickerSettingsCheckItem) hfzVar;
        this.m.setText(stickerSettingsCheckItem.c);
        Integer num = stickerSettingsCheckItem.d;
        if (num != null) {
            int intValue = num.intValue();
            TextView textView = this.n;
            textView.setText(intValue);
            bwt0.p0(textView, true);
        }
        g6l0 g6l0Var = new g6l0();
        SwitchCompat switchCompat = this.o;
        switchCompat.setOnCheckedChangeListener(g6l0Var);
        switchCompat.setChecked(stickerSettingsCheckItem.e);
        switchCompat.setEnabled(stickerSettingsCheckItem.f);
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.h6l0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                i6l0.this.l.invoke(stickerSettingsCheckItem.g, Boolean.valueOf(z));
            }
        });
    }
}

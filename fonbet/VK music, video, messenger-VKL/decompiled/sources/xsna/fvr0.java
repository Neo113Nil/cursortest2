package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vk.voip.ui.settings.participants_view.j;
import com.vkontakte.android.R;

/* compiled from: VhSearch.kt */
/* loaded from: classes7.dex */
public final class fvr0 extends jqr0<CallSettingsItem.h> {
    public static final /* synthetic */ int p = 0;
    public final VkSearchView l;
    public com.vk.movika.sdk.base.observable.a m;
    public final a n;
    public final EditText o;

    /* compiled from: VhSearch.kt */
    public static final class a extends xsj0 {
        public a() {
        }

        @Override // xsna.xsj0, android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            com.vk.movika.sdk.base.observable.a aVar = fvr0.this.m;
            if (aVar != null) {
                aVar.invoke(new j.l(charSequence.toString()));
            }
        }
    }

    public fvr0(VkSearchView vkSearchView) {
        super(vkSearchView);
        this.l = vkSearchView;
        a aVar = new a();
        this.n = aVar;
        vkSearchView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        float f = 16;
        bwt0.f0(vkSearchView, iah0.a(f), 0, iah0.a(f), 0, 10);
        vkSearchView.setVoiceInputEnabled(true);
        vkSearchView.X4(false);
        vkSearchView.setOnBackClickListener(new ge0(19, vkSearchView, this));
        final EditText editView = vkSearchView.getEditView();
        editView.addTextChangedListener(aVar);
        editView.setHint(R.string.voip_participants_without_focus_search_hint);
        editView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.dvr0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                com.vk.movika.sdk.base.observable.a aVar2;
                editView.setHint(z ? R.string.voip_participants_with_focus_search_hint : R.string.voip_participants_without_focus_search_hint);
                if (!z || (aVar2 = this.m) == null) {
                    return;
                }
                aVar2.invoke(new j.l(""));
            }
        });
        this.o = editView;
    }

    @Override // xsna.jqr0
    public final void V5() {
        this.m = null;
    }
}

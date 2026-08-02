package com.lightside.visum;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import defpackage.tje;
import defpackage.tka1;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J7\u0010\u000b\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/lightside/visum/AdapterViewKt$onItemSelect$1", "Landroid/widget/AdapterView$OnItemSelectedListener;", "Landroid/widget/AdapterView;", "parent", "Landroid/view/View;", "view", "", "position", "", "id", "Lzy11;", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "onNothingSelected", "(Landroid/widget/AdapterView;)V", "visum_release"}, k = 1, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes11.dex */
public final class AdapterViewKt$onItemSelect$1 implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ tls $itemListener;
    final /* synthetic */ AdapterView<Adapter> $this_onItemSelect;

    public AdapterViewKt$onItemSelect$1(AdapterView<Adapter> adapterView, tls tlsVar) {
        this.$this_onItemSelect = adapterView;
        this.$itemListener = tlsVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        tje.N(tka1.h(tka1.g(this.$this_onItemSelect)), null, null, new AdapterViewKt$onItemSelect$1$onItemSelected$1(this.$itemListener, view, position, id, null), 3);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> parent) {
        tje.N(tka1.h(tka1.g(this.$this_onItemSelect)), null, null, new AdapterViewKt$onItemSelect$1$onNothingSelected$1(this.$itemListener, null), 3);
    }
}

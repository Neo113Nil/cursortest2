package com.yandex.go.address.address_map_picker.experiment;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import defpackage.pn0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/address/address_map_picker/experiment/AddressMapPickerExperiment;", "Ln96;", "Companion", "$serializer", "com/yandex/go/address/address_map_picker/experiment/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AddressMapPickerExperiment extends n96 {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pn0(12))};
    public final boolean b;
    public final List c;

    public /* synthetic */ AddressMapPickerExperiment(int i, boolean z, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public AddressMapPickerExperiment(int i) {
        this.b = false;
        this.c = EmptyList.a;
    }

    public AddressMapPickerExperiment() {
        this(3);
    }
}

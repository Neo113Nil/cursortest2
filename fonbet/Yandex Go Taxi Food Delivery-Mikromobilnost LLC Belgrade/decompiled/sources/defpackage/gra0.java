package defpackage;

import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.ybsdk.feature.pdf.internal.network.dto.InputParametersValue$InputParametersValueDate;
import com.ybsdk.feature.pdf.internal.network.dto.InputParametersValue$InputParametersValueDateRange;
import com.ybsdk.feature.pdf.internal.network.dto.InputParametersValue$InputParametersValueProduct;
import com.ybsdk.feature.pdf.internal.network.dto.InputParametersValue$InputParametersValueText;

/* loaded from: classes8.dex */
public abstract class gra0 {
    public static final PolymorphicJsonAdapterFactory a = PolymorphicJsonAdapterFactory.of(l0w.class, "InputParametersValue").withSubtype(InputParametersValue$InputParametersValueText.class, "InputParametersValueText").withSubtype(InputParametersValue$InputParametersValueProduct.class, "InputParametersValueProduct").withSubtype(InputParametersValue$InputParametersValueDateRange.class, "InputParametersValueDateRange").withSubtype(InputParametersValue$InputParametersValueDate.class, "InputParametersValueDate");
}

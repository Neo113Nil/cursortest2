package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.GradientColorStop;
import com.ybsdk.rconfig.configs.ProductsV4Gradient;
import com.ybsdk.rconfig.configs.ProductsV4GradientConfig;
import com.ybsdk.rconfig.configs.RadialGradientLayer;

/* loaded from: classes9.dex */
public abstract class ebf0 {
    public static final dfr a = new dfr("yb_mobile_products_v4_gradient", Types.newParameterizedType(CommonExperiment.class, ProductsV4GradientConfig.class), new CommonExperiment(new ProductsV4GradientConfig(new ProductsV4Gradient(40.0f, -0.5f, new RadialGradientLayer(scc.g(new GradientColorStop(new ThemedParameter("#E2C1F9", "#E2C1F9"), 0.0f), new GradientColorStop(new ThemedParameter("#FFB1D4", "#FFB1D4"), 0.35f), new GradientColorStop(new ThemedParameter("#FBFFE4", "#FBFFE4"), 0.65f), new GradientColorStop(new ThemedParameter("#B6CFF7", "#B6CFF7"), 0.95f)), 0.75f, 0.6f, 1.0f, null), scc.g(new RadialGradientLayer(scc.g(new GradientColorStop(new ThemedParameter("#140B18", "#140B18"), 0.0f), new GradientColorStop(new ThemedParameter("#00140B18", "#00140B18"), 1.0f)), 0.0f, 1.0f, 0.8f, null), new RadialGradientLayer(scc.g(new GradientColorStop(new ThemedParameter("#140B18", "#140B18"), 0.0f), new GradientColorStop(new ThemedParameter("#00140B18", "#00140B18"), 1.0f)), 1.0f, 1.0f, 0.8f, null)), null, null), null), ExperimentApplyType.LATEST));
}

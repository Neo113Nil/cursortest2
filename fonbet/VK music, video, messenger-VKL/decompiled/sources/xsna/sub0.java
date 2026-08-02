package xsna;

import java.lang.annotation.Annotation;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.JsonEncodingException;
import xsna.gmi0;

/* compiled from: Polymorphic.kt */
/* loaded from: classes8.dex */
public final class sub0 {

    /* compiled from: Polymorphic.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClassDiscriminatorMode.values().length];
            try {
                iArr[ClassDiscriminatorMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClassDiscriminatorMode.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClassDiscriminatorMode.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(mmi0 mmi0Var, mmi0 mmi0Var2, String str) {
        if ((mmi0Var instanceof slh0) && fvr.f(mmi0Var2.getDescriptor()).contains(str)) {
            StringBuilder a2 = xe9.a("Sealed class '", mmi0Var2.getDescriptor().f(), "' cannot be serialized as base class '", ((slh0) mmi0Var).getDescriptor().f(), "' because it has property name that conflicts with JSON class discriminator '");
            a2.append(str);
            a2.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            throw new IllegalStateException(a2.toString().toString());
        }
    }

    public static final void b(gmi0 gmi0Var) {
        if (gmi0Var instanceof gmi0.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (gmi0Var instanceof gbd0) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (gmi0Var instanceof rub0) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(SerialDescriptor serialDescriptor, j8y j8yVar) {
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof p8y) {
                return ((p8y) annotation).discriminator();
            }
        }
        return j8yVar.a.i;
    }

    public static final void d(String str, JsonElement jsonElement) {
        StringBuilder a2 = t33.a("Class with serial name ", str, " cannot be serialized polymorphically because it is represented as ");
        a2.append(fpf0.a(jsonElement.getClass()).l());
        a2.append(". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
        throw new JsonEncodingException(a2.toString());
    }
}

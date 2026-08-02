package defpackage;

import com.ybsdk.core.common.data.network.dto.ColoredTextDto;
import com.ybsdk.core.common.domain.entities.ColoredTextEntity;
import com.ybsdk.core.utils.ColorModel;

/* loaded from: classes3.dex */
public abstract class aic {
    public static final ColoredTextEntity a(ColoredTextDto coloredTextDto, int i) {
        ColorModel a;
        String text = coloredTextDto.getText();
        a = lvy0.a(coloredTextDto.getThemedColor(), new ColorModel.Attr(i), new xvq(29));
        return new ColoredTextEntity(text, a, false, 4, null);
    }

    public static final ColoredTextEntity b(ColoredTextDto coloredTextDto, ColorModel.Attr attr) {
        ColorModel a;
        String text = coloredTextDto.getText();
        a = lvy0.a(coloredTextDto.getThemedColor(), attr, new xvq(29));
        return new ColoredTextEntity(text, a, false, 4, null);
    }
}

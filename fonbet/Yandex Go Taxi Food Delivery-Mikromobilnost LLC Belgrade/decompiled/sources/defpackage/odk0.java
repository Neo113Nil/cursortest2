package defpackage;

import android.content.Context;
import com.yandex.go.taxi.order.details.v2.state.elements.feedback.rating.e;
import com.yandex.go.taxi.order.models.api.response.RatingDependentVisibilityTextDto;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class odk0 extends e {
    public final c h;

    public odk0(Context context, o2y0 o2y0Var, sqs0 sqs0Var, ru.yandex.taxi.widget.utils.e eVar, jgv jgvVar, tt2 tt2Var, pwy0 pwy0Var, c cVar) {
        super(context, o2y0Var, sqs0Var, eVar, jgvVar, tt2Var, pwy0Var);
        this.h = cVar;
    }

    public static final Object h(odk0 odk0Var, List list, int i, Continuation continuation) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            RatingDependentVisibilityTextDto ratingDependentVisibilityTextDto = (RatingDependentVisibilityTextDto) obj;
            if (ratingDependentVisibilityTextDto.b.isEmpty() || ratingDependentVisibilityTextDto.b.contains(new Integer(i))) {
                break;
            }
        }
        RatingDependentVisibilityTextDto ratingDependentVisibilityTextDto2 = (RatingDependentVisibilityTextDto) obj;
        FormattedText formattedText = ratingDependentVisibilityTextDto2 != null ? ratingDependentVisibilityTextDto2.a : null;
        if (formattedText == null) {
            return null;
        }
        Object i2 = c.i(odk0Var.h, formattedText, null, continuation, 30);
        return i2 == CoroutineSingletons.COROUTINE_SUSPENDED ? i2 : (CharSequence) i2;
    }
}

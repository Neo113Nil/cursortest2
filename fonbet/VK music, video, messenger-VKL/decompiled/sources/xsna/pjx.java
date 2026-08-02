package xsna;

import com.vk.clips.internal.nps.api.model.InternalNpsQuestionValue;
import com.vk.clips.internal.nps.api.model.QuestionType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import xsna.tlo0;
import xsna.wjx;

/* compiled from: InternalNpsMapper.kt */
/* loaded from: classes16.dex */
public final class pjx {

    /* compiled from: InternalNpsMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QuestionType.values().length];
            try {
                iArr[QuestionType.SELECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuestionType.MULTISELECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QuestionType.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QuestionType.STARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[QuestionType.MORE_LESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[QuestionType.SELECT_INLINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static ArrayList a(wjx.a aVar) {
        List<InternalNpsQuestionValue> list = aVar.g.e;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (InternalNpsQuestionValue internalNpsQuestionValue : list) {
            String str = internalNpsQuestionValue.b;
            String str2 = internalNpsQuestionValue.c;
            Set<String> set = aVar.i.get(aVar.g.c);
            arrayList.add(new wpe0(str, str2, set != null ? set.contains(internalNpsQuestionValue.b) : false));
        }
        return arrayList;
    }

    public static tlo0.g b(wjx.a aVar) {
        tlo0.a aVar2 = tlo0.Companion;
        Object[] objArr = {Integer.valueOf(aVar.e), Integer.valueOf(aVar.d)};
        aVar2.getClass();
        return tlo0.a.c(R.string.internal_nps_step_title, objArr);
    }

    public static tlo0.h c(wjx.a aVar) {
        return oq.d(tlo0.Companion, aVar.g.d.b);
    }
}

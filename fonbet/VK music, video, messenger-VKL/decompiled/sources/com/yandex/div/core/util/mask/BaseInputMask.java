package com.yandex.div.core.util.mask;

import com.yandex.div.core.util.mask.BaseInputMask;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.Regex;
import xsna.epx;
import xsna.erm0;
import xsna.fw3;
import xsna.gzs;
import xsna.j5g;
import xsna.zcl;

/* compiled from: BaseInputMask.kt */
/* loaded from: classes7.dex */
public abstract class BaseInputMask {
    private int cursorPosition;
    protected List<? extends MaskChar> destructedValue;
    private final Map<Character, Regex> filters = new LinkedHashMap();
    private MaskData maskData;

    /* compiled from: BaseInputMask.kt */
    public static abstract class MaskChar {

        /* compiled from: BaseInputMask.kt */
        public static final class Dynamic extends MaskChar {

            /* renamed from: char, reason: not valid java name */
            private Character f46char;
            private final Regex filter;
            private final char placeholder;

            public Dynamic(Character ch, Regex regex, char c) {
                super(null);
                this.f46char = ch;
                this.filter = regex;
                this.placeholder = c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Dynamic)) {
                    return false;
                }
                Dynamic dynamic = (Dynamic) obj;
                return epx.f(this.f46char, dynamic.f46char) && epx.f(this.filter, dynamic.filter) && this.placeholder == dynamic.placeholder;
            }

            public final Character getChar() {
                return this.f46char;
            }

            public final Regex getFilter() {
                return this.filter;
            }

            public final char getPlaceholder() {
                return this.placeholder;
            }

            public int hashCode() {
                Character ch = this.f46char;
                int hashCode = (ch == null ? 0 : ch.hashCode()) * 31;
                Regex regex = this.filter;
                return Character.hashCode(this.placeholder) + ((hashCode + (regex != null ? regex.hashCode() : 0)) * 31);
            }

            public final void setChar(Character ch) {
                this.f46char = ch;
            }

            public String toString() {
                return "Dynamic(char=" + this.f46char + ", filter=" + this.filter + ", placeholder=" + this.placeholder + ')';
            }
        }

        /* compiled from: BaseInputMask.kt */
        public static final class Static extends MaskChar {

            /* renamed from: char, reason: not valid java name */
            private final char f47char;

            public Static(char c) {
                super(null);
                this.f47char = c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Static) && this.f47char == ((Static) obj).f47char;
            }

            public final char getChar() {
                return this.f47char;
            }

            public int hashCode() {
                return Character.hashCode(this.f47char);
            }

            public String toString() {
                return "Static(char=" + this.f47char + ')';
            }
        }

        public /* synthetic */ MaskChar(zcl zclVar) {
            this();
        }

        private MaskChar() {
        }
    }

    /* compiled from: BaseInputMask.kt */
    public static final class MaskData {
        private final boolean alwaysVisible;
        private final List<MaskKey> decoding;
        private final String pattern;

        public MaskData(String str, List<MaskKey> list, boolean z) {
            this.pattern = str;
            this.decoding = list;
            this.alwaysVisible = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MaskData)) {
                return false;
            }
            MaskData maskData = (MaskData) obj;
            return epx.f(this.pattern, maskData.pattern) && epx.f(this.decoding, maskData.decoding) && this.alwaysVisible == maskData.alwaysVisible;
        }

        public final boolean getAlwaysVisible() {
            return this.alwaysVisible;
        }

        public final List<MaskKey> getDecoding() {
            return this.decoding;
        }

        public final String getPattern() {
            return this.pattern;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int a = fw3.a(this.pattern.hashCode() * 31, 31, this.decoding);
            boolean z = this.alwaysVisible;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return a + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MaskData(pattern=");
            sb.append(this.pattern);
            sb.append(", decoding=");
            sb.append(this.decoding);
            sb.append(", alwaysVisible=");
            return q0.a(sb, this.alwaysVisible, ')');
        }
    }

    /* compiled from: BaseInputMask.kt */
    public static final class MaskKey {
        private final String filter;
        private final char key;
        private final char placeholder;

        public MaskKey(char c, String str, char c2) {
            this.key = c;
            this.filter = str;
            this.placeholder = c2;
        }

        public final String getFilter() {
            return this.filter;
        }

        public final char getKey() {
            return this.key;
        }

        public final char getPlaceholder() {
            return this.placeholder;
        }
    }

    public BaseInputMask(MaskData maskData) {
        this.maskData = maskData;
        updateMaskData$default(this, maskData, false, 2, null);
    }

    public static /* synthetic */ void applyChangeFrom$default(BaseInputMask baseInputMask, String str, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyChangeFrom");
        }
        if ((i & 2) != 0) {
            num = null;
        }
        baseInputMask.applyChangeFrom(str, num);
    }

    private final String buildBodySubstring(TextDiff textDiff, String str) {
        return str.substring(textDiff.getStart(), textDiff.getAdded() + textDiff.getStart());
    }

    private final String buildTailSubstring(TextDiff textDiff) {
        return collectValueRange(textDiff.getRemoved() + textDiff.getStart(), getDestructedValue().size() - 1);
    }

    private final int calculateMaxShift(String str, int i) {
        int i2;
        if (this.filters.size() <= 1) {
            int i3 = 0;
            while (i < getDestructedValue().size()) {
                if (getDestructedValue().get(i) instanceof MaskChar.Dynamic) {
                    i3++;
                }
                i++;
            }
            i2 = i3 - str.length();
        } else {
            String calculateInsertableSubstring = calculateInsertableSubstring(str, i);
            int i4 = 0;
            while (i4 < getDestructedValue().size() && epx.f(calculateInsertableSubstring, calculateInsertableSubstring(str, i + i4))) {
                i4++;
            }
            i2 = i4 - 1;
        }
        if (i2 < 0) {
            return 0;
        }
        return i2;
    }

    public static /* synthetic */ void replaceChars$default(BaseInputMask baseInputMask, String str, int i, Integer num, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceChars");
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        baseInputMask.replaceChars(str, i, num);
    }

    public static /* synthetic */ void updateMaskData$default(BaseInputMask baseInputMask, MaskData maskData, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMaskData");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        baseInputMask.updateMaskData(maskData, z);
    }

    public void applyChangeFrom(String str, Integer num) {
        TextDiff build = TextDiff.Companion.build(getValue(), str);
        if (num != null) {
            int intValue = num.intValue() - build.getAdded();
            if (intValue < 0) {
                intValue = 0;
            }
            build = new TextDiff(intValue, build.getAdded(), build.getRemoved());
        }
        calculateCursorPosition(build, replaceBodyTail(build, str));
    }

    public final void calculateCursorPosition(TextDiff textDiff, int i) {
        int firstEmptyHolderIndex = getFirstEmptyHolderIndex();
        if (textDiff.getStart() < firstEmptyHolderIndex) {
            firstEmptyHolderIndex = Math.min(firstHolderAfter(i), getValue().length());
        }
        this.cursorPosition = firstEmptyHolderIndex;
    }

    public final String calculateInsertableSubstring(String str, int i) {
        StringBuilder sb = new StringBuilder();
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i;
        gzs<Regex> gzsVar = new gzs<Regex>() { // from class: com.yandex.div.core.util.mask.BaseInputMask$calculateInsertableSubstring$moveToAndGetNextHolderFilter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public final Regex invoke() {
                while (Ref$IntRef.this.element < this.getDestructedValue().size() && !(this.getDestructedValue().get(Ref$IntRef.this.element) instanceof BaseInputMask.MaskChar.Dynamic)) {
                    Ref$IntRef.this.element++;
                }
                Object b0 = j5g.b0(Ref$IntRef.this.element, this.getDestructedValue());
                BaseInputMask.MaskChar.Dynamic dynamic = b0 instanceof BaseInputMask.MaskChar.Dynamic ? (BaseInputMask.MaskChar.Dynamic) b0 : null;
                if (dynamic != null) {
                    return dynamic.getFilter();
                }
                return null;
            }
        };
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            Regex invoke = gzsVar.invoke();
            if (invoke != null && invoke.f(String.valueOf(charAt))) {
                sb.append(charAt);
                ref$IntRef.element++;
            }
        }
        return sb.toString();
    }

    public final void cleanup(TextDiff textDiff) {
        if (textDiff.getAdded() == 0 && textDiff.getRemoved() == 1) {
            int start = textDiff.getStart();
            while (true) {
                if (start < 0) {
                    break;
                }
                MaskChar maskChar = getDestructedValue().get(start);
                if (maskChar instanceof MaskChar.Dynamic) {
                    MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                    if (dynamic.getChar() != null) {
                        dynamic.setChar(null);
                        break;
                    }
                }
                start--;
            }
        }
        clearRange(textDiff.getStart(), getDestructedValue().size());
    }

    public final void clearRange(int i, int i2) {
        while (i < i2 && i < getDestructedValue().size()) {
            MaskChar maskChar = getDestructedValue().get(i);
            if (maskChar instanceof MaskChar.Dynamic) {
                ((MaskChar.Dynamic) maskChar).setChar(null);
            }
            i++;
        }
    }

    public final String collectValueRange(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        while (i <= i2) {
            MaskChar maskChar = getDestructedValue().get(i);
            if (maskChar instanceof MaskChar.Dynamic) {
                MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                if (dynamic.getChar() != null) {
                    sb.append(dynamic.getChar());
                }
            }
            i++;
        }
        return sb.toString();
    }

    public final int firstHolderAfter(int i) {
        while (i < getDestructedValue().size() && !(getDestructedValue().get(i) instanceof MaskChar.Dynamic)) {
            i++;
        }
        return i;
    }

    public final int getCursorPosition() {
        return this.cursorPosition;
    }

    public final List<MaskChar> getDestructedValue() {
        List list = this.destructedValue;
        if (list != null) {
            return list;
        }
        return null;
    }

    public final int getFirstEmptyHolderIndex() {
        Iterator<MaskChar> it = getDestructedValue().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            MaskChar next = it.next();
            if ((next instanceof MaskChar.Dynamic) && ((MaskChar.Dynamic) next).getChar() == null) {
                break;
            }
            i++;
        }
        return i != -1 ? i : getDestructedValue().size();
    }

    public final MaskData getMaskData() {
        return this.maskData;
    }

    public final String getRawValue() {
        return collectValueRange(0, getDestructedValue().size() - 1);
    }

    public final String getValue() {
        StringBuilder sb = new StringBuilder();
        List<MaskChar> destructedValue = getDestructedValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : destructedValue) {
            MaskChar maskChar = (MaskChar) obj;
            if (!(maskChar instanceof MaskChar.Static)) {
                if (maskChar instanceof MaskChar.Dynamic) {
                    MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                    if (dynamic.getChar() != null) {
                        sb.append(dynamic.getChar());
                    }
                }
                if (!this.maskData.getAlwaysVisible()) {
                    break;
                }
                sb.append(((MaskChar.Dynamic) maskChar).getPlaceholder());
            } else {
                sb.append(((MaskChar.Static) maskChar).getChar());
            }
            arrayList.add(obj);
        }
        return sb.toString();
    }

    public abstract void onException(Exception exc);

    public void overrideRawValue(String str) {
        clearRange(0, getDestructedValue().size());
        replaceChars$default(this, str, 0, null, 4, null);
        this.cursorPosition = Math.min(this.cursorPosition, getValue().length());
    }

    public final int replaceBodyTail(TextDiff textDiff, String str) {
        String buildBodySubstring = buildBodySubstring(textDiff, str);
        String buildTailSubstring = buildTailSubstring(textDiff);
        cleanup(textDiff);
        int firstEmptyHolderIndex = getFirstEmptyHolderIndex();
        replaceChars(buildBodySubstring, firstEmptyHolderIndex, buildTailSubstring.length() == 0 ? null : Integer.valueOf(calculateMaxShift(buildTailSubstring, firstEmptyHolderIndex)));
        int firstEmptyHolderIndex2 = getFirstEmptyHolderIndex();
        replaceChars$default(this, buildTailSubstring, firstEmptyHolderIndex2, null, 4, null);
        return firstEmptyHolderIndex2;
    }

    public final void replaceChars(String str, int i, Integer num) {
        String calculateInsertableSubstring = calculateInsertableSubstring(str, i);
        if (num != null) {
            calculateInsertableSubstring = erm0.D0(num.intValue(), calculateInsertableSubstring);
        }
        int i2 = 0;
        while (i < getDestructedValue().size() && i2 < calculateInsertableSubstring.length()) {
            MaskChar maskChar = getDestructedValue().get(i);
            char charAt = calculateInsertableSubstring.charAt(i2);
            if (maskChar instanceof MaskChar.Dynamic) {
                ((MaskChar.Dynamic) maskChar).setChar(Character.valueOf(charAt));
                i2++;
            }
            i++;
        }
    }

    public final void setCursorPosition(int i) {
        this.cursorPosition = i;
    }

    public final void setDestructedValue(List<? extends MaskChar> list) {
        this.destructedValue = list;
    }

    public void updateMaskData(MaskData maskData, boolean z) {
        Object obj;
        String rawValue = (epx.f(this.maskData, maskData) || !z) ? null : getRawValue();
        this.maskData = maskData;
        this.filters.clear();
        for (MaskKey maskKey : this.maskData.getDecoding()) {
            try {
                String filter = maskKey.getFilter();
                if (filter != null) {
                    this.filters.put(Character.valueOf(maskKey.getKey()), new Regex(filter));
                }
            } catch (PatternSyntaxException e) {
                onException(e);
            }
        }
        String pattern = this.maskData.getPattern();
        ArrayList arrayList = new ArrayList(pattern.length());
        for (int i = 0; i < pattern.length(); i++) {
            char charAt = pattern.charAt(i);
            Iterator<T> it = this.maskData.getDecoding().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((MaskKey) obj).getKey() == charAt) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            MaskKey maskKey2 = (MaskKey) obj;
            arrayList.add(maskKey2 != null ? new MaskChar.Dynamic(null, this.filters.get(Character.valueOf(maskKey2.getKey())), maskKey2.getPlaceholder()) : new MaskChar.Static(charAt));
        }
        setDestructedValue(arrayList);
        if (rawValue != null) {
            overrideRawValue(rawValue);
        }
    }
}

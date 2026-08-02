package com.yandex.div.data;

import android.net.Uri;
import com.yandex.div.core.ObserverList;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.util.ConvertUtilsKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.air;
import xsna.bom0;
import xsna.cax;
import xsna.drm0;
import xsna.epx;
import xsna.izs;
import xsna.ll3;
import xsna.pfq0;
import xsna.pn70;
import xsna.s3q0;
import xsna.t8g;
import xsna.x08;
import xsna.ywm;
import xsna.zcl;
import xsna.zr;

/* compiled from: Variable.kt */
/* loaded from: classes7.dex */
public abstract class Variable {
    private final ObserverList<izs<Variable, s3q0>> observers;

    /* compiled from: Variable.kt */
    public static class ArrayVariable extends Variable {
        private final JSONArray defaultValue;
        private final String name;
        private JSONArray value;

        public ArrayVariable(String str, JSONArray jSONArray) {
            super(null);
            this.name = str;
            this.defaultValue = jSONArray;
            this.value = getDefaultValue();
        }

        public JSONArray getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        public String getName() {
            return this.name;
        }

        public JSONArray getValue$div_data_release() {
            return this.value;
        }

        public void set(JSONArray jSONArray) {
            setValue$div_data_release(jSONArray);
        }

        public void setValue$div_data_release(JSONArray jSONArray) {
            if (epx.f(this.value, jSONArray)) {
                return;
            }
            this.value = jSONArray;
            notifyVariableChanged(this);
        }
    }

    /* compiled from: Variable.kt */
    public static class BooleanVariable extends Variable {
        private final boolean defaultValue;
        private final String name;
        private boolean value;

        public BooleanVariable(String str, boolean z) {
            super(null);
            this.name = str;
            this.defaultValue = z;
            this.value = getDefaultValue();
        }

        public boolean getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        public String getName() {
            return this.name;
        }

        public boolean getValue$div_data_release() {
            return this.value;
        }

        public void set(boolean z) {
            setValue$div_data_release(z);
        }

        public void setValue$div_data_release(boolean z) {
            if (this.value == z) {
                return;
            }
            this.value = z;
            notifyVariableChanged(this);
        }
    }

    /* compiled from: Variable.kt */
    public static class ColorVariable extends Variable {
        private final int defaultValue;
        private final String name;
        private int value;

        public ColorVariable(String str, int i) {
            super(null);
            this.name = str;
            this.defaultValue = i;
            this.value = Color.m185constructorimpl(getDefaultValue());
        }

        public int getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        public String getName() {
            return this.name;
        }

        /* renamed from: getValue-WpymAT4$div_data_release, reason: not valid java name */
        public int m138getValueWpymAT4$div_data_release() {
            return this.value;
        }

        /* renamed from: set-cIhhviA, reason: not valid java name */
        public void m139setcIhhviA(int i) throws VariableMutationException {
            Integer invoke = ParsingConvertersKt.STRING_TO_COLOR_INT.invoke(Color.m184boximpl(i));
            if (invoke != null) {
                m140setValuecIhhviA$div_data_release(Color.m185constructorimpl(invoke.intValue()));
                return;
            }
            throw new VariableMutationException("Wrong value format for color variable: '" + ((Object) Color.m191toStringimpl(i)) + '\'', null, 2, null);
        }

        /* renamed from: setValue-cIhhviA$div_data_release, reason: not valid java name */
        public void m140setValuecIhhviA$div_data_release(int i) {
            if (Color.m187equalsimpl0(this.value, i)) {
                return;
            }
            this.value = i;
            notifyVariableChanged(this);
        }
    }

    /* compiled from: Variable.kt */
    public static class DictVariable extends Variable {
        private final JSONObject defaultValue;
        private final String name;
        private JSONObject value;

        public DictVariable(String str, JSONObject jSONObject) {
            super(null);
            this.name = str;
            this.defaultValue = jSONObject;
            this.value = getDefaultValue();
        }

        public JSONObject getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        public String getName() {
            return this.name;
        }

        public JSONObject getValue$div_data_release() {
            return this.value;
        }

        public void set(JSONObject jSONObject) {
            setValue$div_data_release(jSONObject);
        }

        public void setValue$div_data_release(JSONObject jSONObject) {
            if (epx.f(this.value, jSONObject)) {
                return;
            }
            this.value = jSONObject;
            notifyVariableChanged(this);
        }
    }

    /* compiled from: Variable.kt */
    public static class DoubleVariable extends Variable {
        private final double defaultValue;
        private final String name;
        private double value;

        public DoubleVariable(String str, double d) {
            super(null);
            this.name = str;
            this.defaultValue = d;
            this.value = getDefaultValue();
        }

        public double getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        public String getName() {
            return this.name;
        }

        public double getValue$div_data_release() {
            return this.value;
        }

        public void set(double d) {
            setValue$div_data_release(d);
        }

        public void setValue$div_data_release(double d) {
            if (this.value == d) {
                return;
            }
            this.value = d;
            notifyVariableChanged(this);
        }
    }

    /* compiled from: Variable.kt */
    public static class IntegerVariable extends Variable {
        private final long defaultValue;
        private final String name;
        private long value;

        public IntegerVariable(String str, long j) {
            super(null);
            this.name = str;
            this.defaultValue = j;
            this.value = getDefaultValue();
        }

        public long getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        public String getName() {
            return this.name;
        }

        public long getValue$div_data_release() {
            return this.value;
        }

        public void set(long j) {
            setValue$div_data_release(j);
        }

        public void setValue$div_data_release(long j) {
            if (this.value == j) {
                return;
            }
            this.value = j;
            notifyVariableChanged(this);
        }
    }

    /* compiled from: Variable.kt */
    public static class StringVariable extends Variable {
        private final String defaultValue;
        private final String name;
        private String value;

        public StringVariable(String str, String str2) {
            super(null);
            this.name = str;
            this.defaultValue = str2;
            this.value = getDefaultValue();
        }

        public String getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        public String getName() {
            return this.name;
        }

        public String getValue$div_data_release() {
            return this.value;
        }

        public void setValue$div_data_release(String str) {
            if (epx.f(this.value, str)) {
                return;
            }
            this.value = str;
            notifyVariableChanged(this);
        }
    }

    /* compiled from: Variable.kt */
    public static class UrlVariable extends Variable {
        private final Uri defaultValue;
        private final String name;
        private Uri value;

        public UrlVariable(String str, Uri uri) {
            super(null);
            this.name = str;
            this.defaultValue = uri;
            this.value = getDefaultValue();
        }

        public Uri getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        public String getName() {
            return this.name;
        }

        public Uri getValue$div_data_release() {
            return this.value;
        }

        public void set(Uri uri) {
            setValue$div_data_release(uri);
        }

        public void setValue$div_data_release(Uri uri) {
            if (epx.f(this.value, uri)) {
                return;
            }
            this.value = uri;
            notifyVariableChanged(this);
        }
    }

    public /* synthetic */ Variable(zcl zclVar) {
        this();
    }

    private boolean parseAsBoolean(String str) {
        Boolean o0 = drm0.o0(str);
        if (o0 != null) {
            return o0.booleanValue();
        }
        Boolean bool = ConvertUtilsKt.toBoolean(parseAsInt(str));
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new VariableMutationException(zr.a("Unable to convert ", str, " to boolean"), null, 2, null);
    }

    /* renamed from: parseAsColor-C4zCDoM, reason: not valid java name */
    private int m137parseAsColorC4zCDoM(String str) {
        Integer invoke = ParsingConvertersKt.STRING_TO_COLOR_INT.invoke(str);
        if (invoke != null) {
            return Color.m185constructorimpl(invoke.intValue());
        }
        throw new VariableMutationException(air.b('\'', "Wrong value format for color variable: '", str), null, 2, null);
    }

    private double parseAsDouble(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            throw new VariableMutationException(null, e, 1, null);
        }
    }

    private int parseAsInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new VariableMutationException(null, e, 1, null);
        }
    }

    private JSONArray parseAsJsonArray(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException e) {
            throw new VariableMutationException(null, e, 1, null);
        }
    }

    private JSONObject parseAsJsonObject(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e) {
            throw new VariableMutationException(null, e, 1, null);
        }
    }

    private long parseAsLong(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            throw new VariableMutationException(null, e, 1, null);
        }
    }

    private Uri parseAsUri(String str) {
        try {
            return Uri.parse(str);
        } catch (IllegalArgumentException e) {
            throw new VariableMutationException(null, e, 1, null);
        }
    }

    public void addObserver(izs<? super Variable, s3q0> izsVar) {
        this.observers.addObserver(izsVar);
    }

    public abstract String getName();

    public Object getValue() {
        if (this instanceof StringVariable) {
            return ((StringVariable) this).getValue$div_data_release();
        }
        if (this instanceof IntegerVariable) {
            return Long.valueOf(((IntegerVariable) this).getValue$div_data_release());
        }
        if (this instanceof BooleanVariable) {
            return Boolean.valueOf(((BooleanVariable) this).getValue$div_data_release());
        }
        if (this instanceof DoubleVariable) {
            return Double.valueOf(((DoubleVariable) this).getValue$div_data_release());
        }
        if (this instanceof ColorVariable) {
            return Color.m184boximpl(((ColorVariable) this).m138getValueWpymAT4$div_data_release());
        }
        if (this instanceof UrlVariable) {
            return ((UrlVariable) this).getValue$div_data_release();
        }
        if (this instanceof DictVariable) {
            return ((DictVariable) this).getValue$div_data_release();
        }
        if (this instanceof ArrayVariable) {
            return ((ArrayVariable) this).getValue$div_data_release();
        }
        throw new NoWhenBranchMatchedException();
    }

    public void notifyVariableChanged(Variable variable) {
        Assert.assertMainThread();
        Iterator<izs<Variable, s3q0>> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().invoke(variable);
        }
    }

    public void removeObserver(izs<? super Variable, s3q0> izsVar) {
        this.observers.removeObserver(izsVar);
    }

    public void set(String str) throws VariableMutationException {
        if (this instanceof StringVariable) {
            ((StringVariable) this).setValue$div_data_release(str);
            return;
        }
        if (this instanceof IntegerVariable) {
            ((IntegerVariable) this).setValue$div_data_release(parseAsLong(str));
            return;
        }
        if (this instanceof BooleanVariable) {
            ((BooleanVariable) this).setValue$div_data_release(parseAsBoolean(str));
            return;
        }
        if (this instanceof DoubleVariable) {
            ((DoubleVariable) this).setValue$div_data_release(parseAsDouble(str));
            return;
        }
        if (this instanceof ColorVariable) {
            ((ColorVariable) this).m140setValuecIhhviA$div_data_release(m137parseAsColorC4zCDoM(str));
            return;
        }
        if (this instanceof UrlVariable) {
            ((UrlVariable) this).setValue$div_data_release(parseAsUri(str));
        } else if (this instanceof DictVariable) {
            ((DictVariable) this).setValue$div_data_release(parseAsJsonObject(str));
        } else {
            if (!(this instanceof ArrayVariable)) {
                throw new NoWhenBranchMatchedException();
            }
            ((ArrayVariable) this).setValue$div_data_release(parseAsJsonArray(str));
        }
    }

    public void setValue(Variable variable) throws VariableMutationException {
        if ((this instanceof StringVariable) && (variable instanceof StringVariable)) {
            ((StringVariable) this).setValue$div_data_release(((StringVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof IntegerVariable) && (variable instanceof IntegerVariable)) {
            ((IntegerVariable) this).setValue$div_data_release(((IntegerVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof BooleanVariable) && (variable instanceof BooleanVariable)) {
            ((BooleanVariable) this).setValue$div_data_release(((BooleanVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof DoubleVariable) && (variable instanceof DoubleVariable)) {
            ((DoubleVariable) this).setValue$div_data_release(((DoubleVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof ColorVariable) && (variable instanceof ColorVariable)) {
            ((ColorVariable) this).m140setValuecIhhviA$div_data_release(((ColorVariable) variable).m138getValueWpymAT4$div_data_release());
            return;
        }
        if ((this instanceof UrlVariable) && (variable instanceof UrlVariable)) {
            ((UrlVariable) this).setValue$div_data_release(((UrlVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof DictVariable) && (variable instanceof DictVariable)) {
            ((DictVariable) this).setValue$div_data_release(((DictVariable) variable).getValue$div_data_release());
            return;
        }
        if ((this instanceof ArrayVariable) && (variable instanceof ArrayVariable)) {
            ((ArrayVariable) this).setValue$div_data_release(((ArrayVariable) variable).getValue$div_data_release());
            return;
        }
        throw new VariableMutationException("Setting value to " + this + " from " + variable + " not supported!", null, 2, null);
    }

    public void setValueDirectly(Object obj) throws VariableMutationException {
        try {
            if (this instanceof StringVariable) {
                ((StringVariable) this).setValue$div_data_release((String) obj);
                return;
            }
            if (this instanceof IntegerVariable) {
                ((IntegerVariable) this).setValue$div_data_release(((Number) obj).longValue());
                return;
            }
            if (this instanceof BooleanVariable) {
                ((BooleanVariable) this).setValue$div_data_release(((Boolean) obj).booleanValue());
                return;
            }
            if (this instanceof DoubleVariable) {
                ((DoubleVariable) this).setValue$div_data_release(((Number) obj).doubleValue());
                return;
            }
            if (this instanceof ColorVariable) {
                ((ColorVariable) this).m140setValuecIhhviA$div_data_release(((Color) obj).m192unboximpl());
                return;
            }
            if (this instanceof UrlVariable) {
                ((UrlVariable) this).setValue$div_data_release((Uri) obj);
            } else if (this instanceof DictVariable) {
                ((DictVariable) this).setValue$div_data_release((JSONObject) obj);
            } else {
                if (!(this instanceof ArrayVariable)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((ArrayVariable) this).setValue$div_data_release((JSONArray) obj);
            }
        } catch (ClassCastException unused) {
            throw new VariableMutationException("Unable to set value with type " + obj.getClass() + " to " + this, null, 2, null);
        }
    }

    public JSONObject writeToJSON() {
        JSONSerializable pfq0Var;
        if (this instanceof ArrayVariable) {
            pfq0Var = new ll3(Expression.Companion.constant$default(Expression.Companion, ((ArrayVariable) this).getValue$div_data_release(), null, 2, null), getName());
        } else if (this instanceof BooleanVariable) {
            pfq0Var = new x08(Expression.Companion.constant$default(Expression.Companion, Boolean.valueOf(((BooleanVariable) this).getValue$div_data_release()), null, 2, null), getName());
        } else if (this instanceof ColorVariable) {
            pfq0Var = new t8g(Expression.Companion.constant$default(Expression.Companion, Integer.valueOf(((ColorVariable) this).m138getValueWpymAT4$div_data_release()), null, 2, null), getName());
        } else if (this instanceof DictVariable) {
            pfq0Var = new ywm(Expression.Companion.constant$default(Expression.Companion, ((DictVariable) this).getValue$div_data_release(), null, 2, null), getName());
        } else if (this instanceof DoubleVariable) {
            pfq0Var = new pn70(Expression.Companion.constant$default(Expression.Companion, Double.valueOf(((DoubleVariable) this).getValue$div_data_release()), null, 2, null), getName());
        } else if (this instanceof IntegerVariable) {
            pfq0Var = new cax(Expression.Companion.constant$default(Expression.Companion, Long.valueOf(((IntegerVariable) this).getValue$div_data_release()), null, 2, null), getName());
        } else if (this instanceof StringVariable) {
            pfq0Var = new bom0(Expression.Companion.constant$default(Expression.Companion, ((StringVariable) this).getValue$div_data_release(), null, 2, null), getName());
        } else {
            if (!(this instanceof UrlVariable)) {
                throw new NoWhenBranchMatchedException();
            }
            pfq0Var = new pfq0(Expression.Companion.constant$default(Expression.Companion, ((UrlVariable) this).getValue$div_data_release(), null, 2, null), getName());
        }
        return pfq0Var.writeToJSON();
    }

    private Variable() {
        this.observers = new ObserverList<>();
    }
}

package com.yandex.mapkit.styling;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class ProportionFunction implements Serializable {
    private ConstantFunctionPoints constantFunction;
    private LinearTiltFunctionPoints tiltFunction;
    private LinearZoomFunctionPoints zoomFunction;
    private BilinearFunctionMatrix zoomTiltFunction;

    public static ProportionFunction fromConstantFunction(ConstantFunctionPoints constantFunctionPoints) {
        if (constantFunctionPoints == null) {
            ny61.g("Variant value \"constantFunction\" cannot be null");
            return null;
        }
        ProportionFunction proportionFunction = new ProportionFunction();
        proportionFunction.constantFunction = constantFunctionPoints;
        return proportionFunction;
    }

    public static ProportionFunction fromTiltFunction(LinearTiltFunctionPoints linearTiltFunctionPoints) {
        if (linearTiltFunctionPoints == null) {
            ny61.g("Variant value \"tiltFunction\" cannot be null");
            return null;
        }
        ProportionFunction proportionFunction = new ProportionFunction();
        proportionFunction.tiltFunction = linearTiltFunctionPoints;
        return proportionFunction;
    }

    public static ProportionFunction fromZoomFunction(LinearZoomFunctionPoints linearZoomFunctionPoints) {
        if (linearZoomFunctionPoints == null) {
            ny61.g("Variant value \"zoomFunction\" cannot be null");
            return null;
        }
        ProportionFunction proportionFunction = new ProportionFunction();
        proportionFunction.zoomFunction = linearZoomFunctionPoints;
        return proportionFunction;
    }

    public static ProportionFunction fromZoomTiltFunction(BilinearFunctionMatrix bilinearFunctionMatrix) {
        if (bilinearFunctionMatrix == null) {
            ny61.g("Variant value \"zoomTiltFunction\" cannot be null");
            return null;
        }
        ProportionFunction proportionFunction = new ProportionFunction();
        proportionFunction.zoomTiltFunction = bilinearFunctionMatrix;
        return proportionFunction;
    }

    public ConstantFunctionPoints getConstantFunction() {
        return this.constantFunction;
    }

    public LinearTiltFunctionPoints getTiltFunction() {
        return this.tiltFunction;
    }

    public LinearZoomFunctionPoints getZoomFunction() {
        return this.zoomFunction;
    }

    public BilinearFunctionMatrix getZoomTiltFunction() {
        return this.zoomTiltFunction;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.constantFunction = (ConstantFunctionPoints) archive.add((Archive) this.constantFunction, true, (Class<Archive>) ConstantFunctionPoints.class);
        this.zoomFunction = (LinearZoomFunctionPoints) archive.add((Archive) this.zoomFunction, true, (Class<Archive>) LinearZoomFunctionPoints.class);
        this.tiltFunction = (LinearTiltFunctionPoints) archive.add((Archive) this.tiltFunction, true, (Class<Archive>) LinearTiltFunctionPoints.class);
        this.zoomTiltFunction = (BilinearFunctionMatrix) archive.add((Archive) this.zoomTiltFunction, true, (Class<Archive>) BilinearFunctionMatrix.class);
    }
}
